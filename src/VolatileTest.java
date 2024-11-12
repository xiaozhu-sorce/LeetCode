public class VolatileTest {
    public static volatile int race = 0;

    public static synchronized void increase() {
        race++;
    }

    private static final int THREAD_COUNT = 20;

    public static void main(String[] args) {
        Thread[] threads = new Thread[THREAD_COUNT];
        for (int i = 0; i < THREAD_COUNT; i++) {
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 10000; i++) {
                        increase();
                    }
                }
            });
            threads[i].start();
        }

        while (Thread.activeCount() > 2) {
            Thread.yield();
        }
        System.out.println(race);
    }

//    public class Foo {
//        // Configuration is a class that returns customizable properties: it can be mocked to be injected during tests.
//        private Configuration config;
//        public Foo(Configuration myConfig) {
//            this.config = myConfig;
//        }
//        public Collection<User> listUsers() {
//// Find here the way to get the correct folder, in this case using the Configuration object
//            String listingFolder = config.getProperty("myApplication.listingFolder");
//// and use this parameter instead of the hard coded path
//            File userList = new File(listingFolder, "users.txt"); // Compliant
//            Collection<User> users = parse(userList);
//            return users;
//        }
//    }
//
//    public class Foo {
//        public Collection<User> listUsers() {
//            File userList = new File("/home/mylogin/Dev/users.txt"); // Non-Compliant
//            Collection<User> users = parse(userList);
//            return users;
//        }
//    }
}

