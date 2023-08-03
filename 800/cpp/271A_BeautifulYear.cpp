#include <bits/stdc++.h>

using namespace std;

bool distinct(int n) {
	set<int> s;
	while (n != 0) {
		s.insert(n % 10);
		n /= 10;
	}
	if (s.size() == 4) {
		return true;
	}
	return false;
}

int main() {
	int y;
	cin >> y;
	while (!distinct(++y));
	cout << y << "\n";
}