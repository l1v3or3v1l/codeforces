#include <bits/stdc++.h>

using namespace std;

string printNums(string n, int len) {
	string s = "";
	for(int i = 0; i < len; i++) {
		s += n + "+";
	}
	return s;
}

int main() {
	string s;
	cin >> s;
	int one = 0, two = 0, three = 0;
	for (int i = 0; i < s.length(); i++) {
		if (s.at(i) == '1') {
			one++;
		} else if (s.at(i) == '2') {
			two++;
		} else if (s.at(i) == '3'){
			three++;
		}
	}
	string out = "";
	out += printNums("1", one);
	out += printNums("2", two);
	out += printNums("3", three);
	cout << out.substr(0, out.length()-1) << "\n";
}