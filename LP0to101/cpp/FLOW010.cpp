#include <bits/stdc++.h>
using namespace std;

int main() {
	int t;
	char c;
	cin >> t;
	while(t--) {
		cin >> c;
		c = tolower(c);
		switch(c) {
			case 'b':
				cout << "BattleShip\n";
				break;
			case 'c':
				cout << "Cruiser\n";
				break;
			case 'd':
				cout << "Destroyer\n";
				break;
			case 'f':
				cout << "Frigate\n";
				break;
		}
	}
}
