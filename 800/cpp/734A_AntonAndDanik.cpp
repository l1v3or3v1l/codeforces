#include <bits/stdc++.h>

using namespace std;

int main() {
	int n, a = 0, d = 0;
	char c[1];
	cin >> n;
	while (n--) {
		cin >> c[0];
		if (c[0] == 'A') {
			a++;		
		} else {
			d++;
		}
	}
	if (a > d) {
		cout << "Anton\n";
	} else if (d > a) {
		cout << "Danik\n";
	} else {
		cout << "Friendship\n";
	}
}