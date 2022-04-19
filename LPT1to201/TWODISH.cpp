#include <bits/stdc++.h>
using namespace std;

int main() {
	int t, n, a, b, c;
	cin >> t;
	while (t--) {
		cin >> n >> a >> b >> c;
		n -= min(a, b);
		b = max(a, b) - min(a, b);
		n -= min(b, c);
		if (n<=0)
			cout << "YES" << endl;
		else
			cout << "NO" << endl;
	}
}
