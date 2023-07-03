import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;


@ExtendWith(MockitoExtension.class)
class MonopolyTest {
   Monopoly player = new Monopoly(0);

    @Test
    public void when_die_rolls_are_1_and_2_current_position_should_advance_to_3(){
        //WRITE CODE HERE
        Monopoly player1 = Mockito.spy(player);
        Mockito.doReturn(1, 2).when(player1).throwDie();
        int position = player1.advance();
        assertThat(position, equalTo(3));
    }
    @Test
    public void when_die_rolls_are_3_and_3_advance_should_be_called_again_and_when_1_and_3_are_rolled_current_position_should_be_updated_to_10(){
        // WRITE CODE HERE
        Monopoly player1 = Mockito.spy(player);
        Mockito.doReturn(3, 3, 1, 3).when(player1).throwDie();
        int position = player1.advance();
        assertThat(position, equalTo(10));
    }
}