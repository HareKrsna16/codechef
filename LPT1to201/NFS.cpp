#include <bits/stdc++.h>
using namespace std;

int main() {
	long long int t, u, v, a, s, ans;
	cin >> t;
	while(t--) {
		cin >> u >> v >> a >> s;
		ans = ceil(sqrt(u*u-2*a*s));
		cout << ((v>=ans)?"Yes":"No") << endl;
	}
}
