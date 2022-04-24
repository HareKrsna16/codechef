#include <bits/stdc++.h>
using namespace std;

int main() {
	long long int t, n, s, a, b;
	cin >> t;
	while(t--) {
		cin >> n >> s;
		if (n < s) {
			a = n;
			b = s-n;
			cout << abs(a-b) << endl;
		} else {
			cout << s << endl;
		}
	}
}
