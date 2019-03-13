package earen.com.daggertest.objects;

import dagger.Component;
import earen.com.daggertest.MainActivity;

@Component
public interface CarComponent {

    Car getCar();

    void inject(MainActivity mainActivity);
}