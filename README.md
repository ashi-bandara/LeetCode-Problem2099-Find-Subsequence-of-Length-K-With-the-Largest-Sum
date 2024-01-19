
# LeetCode Challenge D33

## Overview

Welcome to my LeetCode solution repository! This project addresses the coding challenge presented by [2099. Find Subsequence of Length K With the Largest Sum](https://leetcode.com/problems/find-subsequence-of-length-k-with-the-largest-sum/). Below, you'll find details about the problem, my approach to solving it, and the implemented solution.

## Problem Statement
You are given an integer array  `nums`  and an integer  `k`. You want to find a  *subsequence* of  `nums`  of length  `k`  that has the  *largest*  sum.

Return  _*any*  such subsequence as an integer array of length_ `k`.

A  *subsequence*  is an array that can be derived from another array by deleting some or no elements without changing the order of the remaining elements.

**Example**

> **Input:** nums = [2,1,3,3], k = 2
> 
>**Output:** [3,3]
> 
>**Explanation:** The subsequence has the largest sum of 3 + 3 = 6.

**Language Used**
> Java

**Difficulty**
> Easy

## Solution Overview
The algorithm begins by creating a sorted copy of the original array (`numsCopy`) to facilitate the identification of the largest elements. Subsequently, a new list (`list`) is populated with the k largest elements from the sorted copy. The algorithm then iterates through the original array, searching for elements that match those in the list. When a match is found, the corresponding element is added to the result array, and the element is removed from the list to prevent repetitions. The process continues until the desired number of elements (k) are added to the result array, at which point the outer loop breaks.

The algorithm employs a two-level nested loop structure, where the outer loop iterates through each element in the original array, and the inner loop searches for matching elements in the list. The use of a break statement in both loops optimizes the algorithm by terminating the loops prematurely when the desired conditions are met, improving efficiency and preventing unnecessary iterations. The result is a subsequence of length k with the largest sum, preserving the original order of the elements in the array.
