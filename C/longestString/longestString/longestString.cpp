// longestString.cpp : 定义控制台应用程序的入口点。
//

#include "stdafx.h"
#include "stdio.h"
#include "iostream"
#include "string"
using namespace std;

class Solution {
public:
	int lengthOfLongestSubstring(string s) {
		string b = s.substr(1, 4);
		cout << b << endl;

		string temp;

		for (int i = 0; i < s.length; i++) {
			for (int j = i + 1; j < s.length; j++) {
				if (s.substr(j, j) != s.substr(i, i)) {
					continue;
				}
			}
		}
		return 0;
	}

public:
	int notRept(string s) {
		
	}
		
};

int main()
{
	Solution test;
	test.lengthOfLongestSubstring("hfdjasfhkjdahfkjdhakjfdshkaj");
	int a;
	printf("aaaaa");
	getchar();
    return 0;
}

