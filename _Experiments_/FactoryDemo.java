package _Experiments_;
/*@formatter:off*/
abstract class CPU {}
    class EmberCPU extends CPU {}
    class EnginolaCPU extends CPU {}
abstract class MMU {}
    class EmberMMU extends MMU {}
    class EnginolaMMU extends MMU {}
/*@formatter:on*/
class EmberToolkit extends AbstractFactory
{
    @Override
    public CPU createCPU()
    {
        return new EmberCPU();
    }
    @Override
    public MMU createMMU()
    {
        return new EmberMMU();
    }
}
class EnginolaToolkit extends AbstractFactory
{
    @Override
    public CPU createCPU()
    {
        return new EnginolaCPU();
    }
    @Override
    public MMU createMMU()
    {
        return new EnginolaMMU();
    }
}
enum Architecture
{
    ENGINOLA,EMBER
}
abstract class AbstractFactory
{
    private static final EmberToolkit EMBER_TOOLKIT=new EmberToolkit();
    private static final EnginolaToolkit ENGINOLA_TOOLKIT=new EnginolaToolkit();
    // Returns a concrete factory object that is an instance of the
    // concrete factory class appropriate for the given architecture.
    static AbstractFactory getFactory(Architecture architecture)
    {
        AbstractFactory factory=null;
        switch(architecture)
        {
            case ENGINOLA:
                factory=ENGINOLA_TOOLKIT;
                break;
            case EMBER:
                factory=EMBER_TOOLKIT;
        }
        return factory;
    }
    public abstract CPU createCPU();
    public abstract MMU createMMU();
}
public class FactoryDemo
{
    public static void main(String[] args)
    {
        AbstractFactory factory=AbstractFactory.getFactory(Architecture.EMBER);
        CPU cpu=factory.createCPU();
    }
}
