
# 26. Remove Element

**Difficulty** : Easy

**Link** : [https://leetcode.com/problems/remove-element/](https://leetcode.com/problems/remove-element/)

---
### Question
> Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums > which are not equal to val.
> 
> Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
> 
> Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size  > of nums.
> Return k.
>
> Example:
>
> Input: nums = [3,2,2,3], val = 3
> Output: 2, nums = [2,2,_,_]
> Explanation: Your function should return k = 2, with the first two elements of nums being 2.
> It does not matter what you leave beyond the returned k (hence they are underscores).

### Solution Concept


**First Loop**

> val = 3
>
> indexToReplce = 0, count = 0
>
> nums = [**1**,2,3,4]
>
> val **3** != **1** , it will replce nums[indexToReplce] to 1 and increase the index to be replace and number of count ++;


**Second Loop**

> val = 3
>
> indexToReplce = 1, count = 1
>
> nums = [1,**2**,3,4]
>
> val **3** != **2** , it will replce nums[indexToReplce] to 2 and increase the index to be replace and number of count ++;


**Third Loop**

> val = 3
>
> indexToReplce = 2, count = 2
> 
> nums = [1,2,**3**,4]
>
> val **3** == **3** , it will do nothing

**Last Loop**

> val = 3
>
> indexToReplce = 2, count = 2
>
> nums = [1,2,**4**,4]
>
> val **3** != **4** , it will replce nums[indexToReplce] to 4 and increase the index to be replace and number of count ++;

**Finally**

> indexToReplce = 3, count = 3
> 
> Lastly it will return the count

