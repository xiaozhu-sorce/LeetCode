package LinkedList;

//优先级队列，二叉堆
public class MaxPQ <Key extends Comparable<Key>> {
    // 存储元素的数组
    private Key[] pq;
    // 当前 Priority Queue 中的元素个数
    private int N = 0;

    public MaxPQ(int cap) {
        // 索引 0 不用，所以多分配一个空间
        pq = (Key[]) new Comparable[cap + 1];
    }

    /* 返回当前队列中最大元素 */
    public Key max() {
        return pq[1];
    }

    /* 插入元素 e */
    public void insert(Key e) {
        N++;
        // 先把新元素加到最后
        pq[N] = e;
        // 然后让它上浮到正确的位置
        swim(N);
    }

    /* 删除并返回当前队列中最大元素 */
    public Key delMax() {
        // 最大堆的堆顶就是最大元素
        Key max = pq[1];
        // 把这个最大元素换到最后，删除之
        exch(1, N);
        pq[N] = null;
        N--;
        // 让 pq[1] 下沉到正确位置
        sink(1);
        return max;
    }

    /* 上浮第 k 个元素，以维护最大堆性质 */
    private void swim(int k) {
        while(k > 0 && less(parent(k),k)){
            exch(parent(k),k);
            k = parent(k);
        }
    }

    /* 下沉第 k 个元素，以维护最大堆性质 */
    private void sink(int k) {
        // 如果沉到堆底，就沉不下去了
        while (left(k) <= N) {
            // 先假设左边节点较大
            int older = left(k);
            // 如果右边节点存在，比一下大小
            if (right(k) <= N && less(older, right(k)))
                older = right(k);
            // 结点 k 比俩孩子都大，就不必下沉了
            if (less(older, k)) break;
            // 否则，不符合最大堆的结构，下沉 k 结点
            exch(k, older);
            k = older;
        }
    }

    /* 交换数组的两个元素 */
    private void exch(int i, int j) {
        Key temp = pq[i];
        pq[i] = pq[j];
        pq[j] = temp;
    }

    /* pq[i] 是否比 pq[j] 小？ */
    private boolean less(int i, int j) {
        return pq[i].compareTo(pq[j]) < 0;
    }

    /* 返回左孩子的位置 */
    private int left(int i){
        return 2*i;
    }

    /* 返回右孩子的位置 */
    private int right(int i){
        return 2*i+1;
    }

    /* 返回父节点的位置 */
    private int parent(int i){
        return i/2;
    }
}