package com.hemalpatel.structural.flyweight.factory;

import com.hemalpatel.structural.flyweight.beans.Mobile;

public interface FlyWeightFactory {
	enum Model {Apple, Google, Samsung};
	Mobile getMobile(Model m);
}
