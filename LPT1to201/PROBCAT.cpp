#include <bits/stdc++.h>
using namespace std;

int main() {
	int t, x;
	cin >> t;
	while(t--) {
		cin >> x;
		cout << ((x>=1&&x<100)?"Easy":((x>=100&&x<200)?"Medium":"Hard")) << endl;
	}
}
