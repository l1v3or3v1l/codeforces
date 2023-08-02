#include <bits/stdc++.h>

using namespace std;

int main() {
	int n, h, i;
	cin >> n >> h;
	int c = n;
	while(n--){
		cin >> i;
		c += (i > h);
	}
	cout << c << "\n";
}