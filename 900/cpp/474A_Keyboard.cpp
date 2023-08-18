#include <bits/stdc++.h>

using namespace std;

int main() {
	string s = "qwertyuiopasdfghjkl;zxcvbnm,./";
	char c;
	cin >> c;
	string en;
	cin >> en;
	string d;
	int ch = 0;
	if (c == 'R') {
		ch = -1;
	} else {
		ch = 1;
	}
	for (int i = 0; i < en.length(); i++) {
		d += s.at(s.find(en.at(i)) + ch);
	}
	cout << d << endl;
}