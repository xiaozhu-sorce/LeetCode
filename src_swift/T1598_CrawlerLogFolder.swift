import Cocoa

class Solution {
    func minOperations(_ logs: [String]) -> Int {
        var depth = 0
        for s in logs{
            if s == "../"{
                depth = max(depth-1,0)
            }else if  s[s.startIndex] != "."{
                depth+=1
            }
        }
        return depth

    }
}