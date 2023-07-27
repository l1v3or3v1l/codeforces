#include <bits/stdc++.h>

using namespace std;

int main() {
	int n, X = 0;
	cin >> n;
	string x;
	while (n--) {
		cin >> x;
		if (x.at(1) == '+') {
			X++;
		} else {
			X--;
		}
	}
	cout << X << "\n";
}