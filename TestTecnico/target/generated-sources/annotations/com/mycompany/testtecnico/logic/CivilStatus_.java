package com.mycompany.testtecnico.logic;

import com.mycompany.testtecnico.logic.Person;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-12-15T06:24:27", comments="EclipseLink-2.7.8.v20201217-rNA")
@StaticMetamodel(CivilStatus.class)
public class CivilStatus_ { 

    public static volatile ListAttribute<CivilStatus, Person> persons;
    public static volatile SingularAttribute<CivilStatus, Integer> id;
    public static volatile SingularAttribute<CivilStatus, String> status;

}