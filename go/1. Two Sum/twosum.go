package main

import "fmt"

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
*/

func main() {
	fmt.Println("Two Sum")
	nums := []int{2, 7, 11, 15}
	target := 9
	// twoSum(nums, target)
	twoSum_web(nums, target)
	// for 1:=0;i<2;++ {
	// 	fmt.Printf("found %d ", check[i])
	// }
}

// func twoSum(nums []int, target int) []int {
// 	bucket := make(map[int]int)
// 	numSize := len(nums)
// 	if numSize < 1 {
// 		fmt.Println("nums size is 0")
// 		return nil
// 	}
// 	var found []int
// 	for i := 0; i < numSize; i++ {
// 		var check = target - nums[i]
// 		if _, ok := bucket[check]; ok {
// 			return []int{i, bucket[check]}
// 		}
// 		bucket[nums[i]] = i
// 	}
// 	return found
// }

func twoSum_web(nums []int, target int) []int {
	indexMap := make(map[int]int)
	for currIndex, currNum := range nums {
		fmt.Printf("test val %d \n", currNum)
		if requiredIdx, isPresent := indexMap[target-currNum]; isPresent {

			return []int{requiredIdx, currIndex}
		}
		indexMap[currNum] = currIndex
	}
	return []int{}
}
