package pl.kazmierski.springbootapidocker;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.BDDMockito.given;

@RunWith(MockitoJUnitRunner.class)
public class AnimalControllerTest2 {


    @Mock private AnimalRepo animalRepo;

    @InjectMocks
    AnimalController animalController;

    @Before
    public void init() {
        given(animalRepo.findAll()).willReturn(prepareMockData());
    }

    @Test
    void getAnimals() {
        System.out.println();
/*        List<Animal> animals = animalController.getAnimals();
        //then
        Assert.assertThat(animals, Matchers.hasSize(2));*/
    }

    private List<Animal> prepareMockData() {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("cat"));
        animals.add(new Animal("dog"));
        return animals;
    }
}