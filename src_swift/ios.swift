import Cocoa
class ios{
    func Add(a : Int, b : Int) -> Int{
        while (b != 0) {
            var goBit = (a & b) << 1
            a = a^b
            b = goBit
        }
        return a
    }

    func minus(a : Int, b : Int) -> Int{
        int B = ~(b-1)
        return Add(a,B)
    }

    func mult(a : Int, b : Int) -> Int{
        var i = 0
        var sum = 0
        while(i < b)    sum = Add(sum , a)    
    }

    func division(a : Int, b : Int) -> Int{
        var i = 0
        while (a < 0){
            a = minus(a,b)
            i = i+1
        }
        return i 
    }

    func nienine(){
        for i in 1...9{
            for j in 1...i{
                print("\\(j) x \\(i) = \\(j * i)", terminator:  i == j ? "\\n" : "\\t")
            }
        }
    }

    func prime(){
        for i in 2...100{
            var s = 2
            while ( s < i){
                if(i % s == 0){
                    break
                }
                s = s+1
            }
            if(s >= i)
                print(" \(i) ")
        }
    }

}