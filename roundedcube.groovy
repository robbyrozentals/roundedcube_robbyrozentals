//create a rounded cube
CSG roundedCube = new RoundedCube(	59,// X dimention
				75,// Y dimention
				10//  Z dimention
				)
				.cornerRadius(4)// sets the radius of the corner
				.toCSG()// converts it to a CSG tor display
return roundedCube