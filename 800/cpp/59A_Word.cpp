#include <bits/stdc++.h>

using namespace std;

int main() {
	string s;
	cin >> s;
	int n = s.length(), l = 0, u = 0;
	while (--n >= 0) {
		if (islower(s.at(n))) {
			l++;
		} else {
			u++;
		}
	}
	if (u > l) {
		transform(s.begin(), s.end(), s.begin(), ::toupper);
	} else {
		transform(s.begin(), s.end(), s.begin(), ::tolower);
	}
	cout << s << "\n";
}