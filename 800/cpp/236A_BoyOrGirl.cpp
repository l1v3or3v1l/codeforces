#include <bits/stdc++.h>

using namespace std;

int main() {
	string s;
	cin >> s;
	set <char> distinct;
	for (int i = 0; i < s.length(); i++) {
		distinct.insert(s.at(i));
	}
	if (distinct.size() % 2 == 0) {
		cout << "CHAT WITH HER!\n";
	} else {
		cout << "IGNORE HIM!\n";
	}
}