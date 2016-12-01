struct node1 {
	float x;
	float y;
	float z;
	;
};
node1 NODES1[1024];

void main() {
	float dist[1024];

	for (int i = 0; i < 1024; i += 16) {
		float x[16], y[16], z[16], d[16];
		for (int i1 = 0; i1 < 16; i1++) {
			x[i1] = NODES1[i + i1].x;
		}
		for (int i1 = 0; i1 < 16; i1++) {
			y[i1] = NODES1[i + i1].y;
		}
		for (int i1 = 0; i1 < 16; i1++) {
			z[i1] = NODES1[i + i1].z;
		}
		for (int i1 = 0; i1 < 16; i1++) {
			d[i1] = sqrtf(x[i1] * x[i1] + y[i1] * y[i1] + z[i1] * z[i1]);
		}
		for (int i1 = 0; i1 < 16; i1++) {
			dist[i + i1] = d[i1];
		}
	}
}
