import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(ManipulaString.class)
public class ManipulaStringTest {

    @Test
    public void ConcatenaSimplesComSaudacao(){
        //arrenge
        ManipulaString manipulaString = new ManipulaString();
        String atual = "";
        String esperado = "Bem vindo!!! seu resultado: João Dias";

        //act
        atual = manipulaString.concatena("João ","Dias", true);

        //assert
        Assert.assertEquals(atual, esperado);
    }

    @Test
    public void ConcatenaPrimeiroValorNuloStrings(){
        //arrenge
        ManipulaString manipulaString = new ManipulaString();
        String atual = "";
        String esperado = "Dias";

        //act
        atual = manipulaString.concatena(null,"Dias");

        //assert
        Assert.assertEquals(atual, esperado);
    }

    @Test
    public void ConcatenaSegundoValorNuloStrings(){
        //arrenge
        ManipulaString manipulaString = new ManipulaString();
        String atual = "";
        String esperado = "João";

        //act
        atual = manipulaString.concatena("João",null);

        //assert
        Assert.assertEquals(atual, esperado);
    }

    @Test
    public void ConcatenaPrimeiroESegundoValorNuloStrings(){
        //arrenge
        ManipulaString manipulaString = new ManipulaString();
        String atual = "";
        String esperado = "";

        //act
        atual = manipulaString.concatena(null,null);

        //assert
        Assert.assertEquals(atual, esperado);
    }

    @Test
    public void ConcatenaPrimeiroESegundoValorEmptyStrings(){
        //arrenge
        ManipulaString manipulaString = new ManipulaString();
        String atual = "";
        String esperado = "";

        //act
        atual = manipulaString.concatena("","");

        //assert
        Assert.assertEquals(atual, esperado);
    }

    @Test
    public void ConcatenaPrimeiroValorEmptyStrings(){
        //arrenge
        ManipulaString manipulaString = new ManipulaString();
        String atual = "";
        String esperado = "Dias";

        //act
        atual = manipulaString.concatena("","Dias");

        //assert
        Assert.assertEquals(atual, esperado);
    }

    @Test
    public void ConcatenaSegundoValorEmptyStrings(){
        //arrenge
        ManipulaString manipulaString = new ManipulaString();
        String atual = "";
        String esperado = "João";

        //act
        atual = manipulaString.concatena("João","");

        //assert
        Assert.assertEquals(atual, esperado);
    }

    @Test
    public void ConcatenaSimplesAlterandoSaudacaoMock() throws Exception {
        //arrenge
        ManipulaString manipulaString = new ManipulaString();
        String atual = "";
        String esperado = "Eai Blz? Seu resultado: João Dias";
        final String METHOD = "GetSaudacao";

        ManipulaString spy = PowerMockito.spy(manipulaString);
        PowerMockito.when(spy,METHOD).thenReturn((String) "Eai Blz? Seu resultado: ");

        //act
        atual = spy.concatena("João ","Dias", true);

        //assert
        Assert.assertEquals(atual, esperado);
    }

    @Test
    public void ConcatenaSimplesSemSaudacaoSemParametro() throws Exception {
        //arrenge
        ManipulaString manipulaString = new ManipulaString();
        String atual = "";
        String esperado = "João Dias";
        final String METHOD = "GetSaudacao";

        ManipulaString spy = PowerMockito.spy(manipulaString);
        PowerMockito.when(spy,METHOD).thenReturn((String) "");

        //act
        atual = spy.concatena("João ","Dias");

        //assert
        Assert.assertEquals(atual, esperado);
    }

    @Test
    public void ConcatenaSimplesSemSaudacaoComParametro() throws Exception {
        //arrenge
        ManipulaString manipulaString = new ManipulaString();
        String atual = "";
        String esperado = "João Dias";
        final String METHOD = "GetSaudacao";

        ManipulaString spy = PowerMockito.spy(manipulaString);
        PowerMockito.when(spy,METHOD).thenReturn((String) "");

        //act
        atual = spy.concatena("João ","Dias", false);

        //assert
        Assert.assertEquals(atual, esperado);
    }


}
