class T0475_Heaters{
    func findRadius(_ houses: [Int], _ heaters: [Int]) -> Int {
        let houses = houses.sorted()
        let heaters = heaters.sorted()
        var ans = 0,len = 0
        for i in 0..<houses.count{
            var site = houses[i]
            len = abs(heaters[0] - site)
            for j in 0..<heaters.count{
                if len > abs(heaters[j]-site){
                    len = abs(heaters[j]-site)
                }
            }
            ans = max(len,ans)
        }
        return ans
    }
}