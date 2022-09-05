/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
*/

var twoSum = function (nums, target) {
  // check
  if (nums.length < 1) {
    console.log("not nums ");
    return;
  }
  var numsMap = new Map();

  for (let i = 0; i < nums.length; i++) {
    let temp = target - nums[i];
    if (numsMap.has(temp)) {
      let j = numsMap.get(temp);
      if (i != j) {
        return [i, j];
      }
    }
    numsMap.set(nums[i], i);
  }
};

nums = [3, 3];
target = 6;

out = twoSum(nums, target);
for (i = 0; i < out.length; i++) {
  console.log("out " + out[i]);
}
