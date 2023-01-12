package entidades;

import entidades.Mes;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-06-23T22:42:17")
@StaticMetamodel(Año.class)
public class Año_ { 

    public static volatile SingularAttribute<Año, Integer> idAño;
    public static volatile SingularAttribute<Año, String> nAño;
    public static volatile CollectionAttribute<Año, Mes> mesCollection;

}