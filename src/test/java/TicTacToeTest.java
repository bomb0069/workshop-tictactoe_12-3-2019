import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TicTacToeTest {

    TicTacToe game;

    @Before
    public void setup() {
        game = new TicTacToe();
    }

    @Test
    public void when_start_the_game_board_should_be_empty() {
        Assert.assertTrue(game.isEmpty());
    }

    @Test
    public void when_mark_something_the_game_should_not_be_empty() {
        game.mark(1);

        Assert.assertFalse(game.isEmpty());
    }

    @Test
    public void after_first_move_the_game_continue_with_O(){
        String expected = "continueO";

        game.mark(1);

        Assert.assertEquals(expected, game.getStatus());
    }

    @Test
    public void after_second_move_the_game_continue_with_X(){
        String expected = "continueX";

        game.mark(1);
        game.mark(4);

        Assert.assertEquals(expected, game.getStatus());
    }

    @Test
    public void after_first_row_is_marked_by_X_the_game_status_is_X_win(){
        String expected = "XWin";

        game.mark(1);
        game.mark(4);
        game.mark(2);
        game.mark(5);
        game.mark(3);

        Assert.assertEquals(expected, game.getStatus());
    }

    @Test
    public void after_first_row_is_marked_by_O_the_game_status_is_O_win(){
        String expected = "OWin";

        game.mark(9);
        game.mark(1);
        game.mark(4);
        game.mark(2);
        game.mark(5);
        game.mark(3);

        Assert.assertEquals(expected, game.getStatus());
    }

}
