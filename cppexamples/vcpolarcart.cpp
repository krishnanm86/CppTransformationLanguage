struct CartesianCoordinate {
	float x;
	float y;;
};
CartesianCoordinate input[1000];

struct PolarCoordinate {
	float r;
	float phi;;
};
PolarCoordinate output[1000];

void fn() {
	for (int i = 0; i < 1000; i++) {
		float temp1 = input[i].x;
		float temp2 = input[i].y;
		output[i].r = std::sqrt((x * x) + (y * y));
		output[i].phi = std::atan2(y, x) * 57.295780181884765625f;
		if (output[i].phi < 0.f)
			output[i].phi += 360.f;
	}
}
