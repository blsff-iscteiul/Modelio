/* 
 * Copyright 2013-2019 Modeliosoft
 * 
 * This file is part of Modelio.
 * 
 * Modelio is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Modelio is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with Modelio.  If not, see <http://www.gnu.org/licenses/>.
 * 
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2010.07.19 at 01:40:57 PM CEST
//
package org.modelio.patterns.model.information;

import javax.xml.bind.annotation.XmlRegistry;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the
 * com.modeliosoft.modelio.patterndesigner.model.information package.
 * <p>
 * An ObjectFactory allows you to programmatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 */
@objid ("3c03a366-87dd-46e8-9df6-66e6a7609128")
@XmlRegistry
public class ObjectFactory {
    /**
     * Create a new ObjectFactory that can be used to create new instances of
     * schema derived classes for package:
     * com.modeliosoft.modelio.patterndesigner.model.information
     */
    @objid ("243daaea-f2d1-45c4-9904-2f6375ba3500")
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ModuleDependency }
     */
    @objid ("a28d6e39-c0d7-40b6-9fe4-fc96cd2fc442")
    public ModuleDependency createModuleDependency() {
        return new ModuleDependency();
    }

    /**
     * Create an instance of {@link ExternalDependency }
     */
    @objid ("7a512285-1b81-424f-b0ff-ae9ebccaa4e4")
    public ExternalDependency createExternalDependency() {
        return new ExternalDependency();
    }

    /**
     * Create an instance of {@link Parameter }
     */
    @objid ("567b6b80-ea4b-418b-a190-af7a0aceb1fe")
    public Parameter createParameter() {
        return new Parameter();
    }

    /**
     * Create an instance of {@link RAMCDependency }
     */
    @objid ("dbd699e9-f4f6-4731-9ded-d473a51c8f42")
    public RAMCDependency createRAMCDependency() {
        return new RAMCDependency();
    }

    /**
     * Create an instance of {@link RootParameter }
     */
    @objid ("3f64db36-03ee-4912-8492-f1ba414485f2")
    public RootParameter createRootParameter() {
        return new RootParameter();
    }

    /**
     * Create an instance of {@link ElementParameter }
     */
    @objid ("27f43c16-3586-4801-8343-acb5ab89792c")
    public ElementParameter createElementParameter() {
        return new ElementParameter();
    }

    /**
     * Create an instance of {@link StringParameter }
     */
    @objid ("cfcfd479-1252-48c5-ba3c-47d4edf9d644")
    public StringParameter createStringParameter() {
        return new StringParameter();
    }

    /**
     * Create an instance of {@link Category }
     */
    @objid ("c55da159-c436-4009-a2ce-7649f49bd804")
    public Category createCategory() {
        return new Category();
    }

    /**
     * Create an instance of {@link PatternDependency }
     */
    @objid ("124b9d0e-f045-475d-9532-e80b1ca0df0c")
    public PatternDependency createPatternDependency() {
        return new PatternDependency();
    }

    /**
     * Create an instance of {@link ConstantParameter }
     */
    @objid ("d3cc6991-434f-44b9-ab4a-8b687c09fb3b")
    public ConstantParameter createConstentParameter() {
        return new ConstantParameter();
    }

    /**
     * Create an instance of {@link PatternParameter }
     */
    @objid ("8b248331-2e7e-4336-9466-97cd17aede03")
    public PatternParameter createPatternParameter() {
        return new PatternParameter();
    }

    /**
     * Create an instance of {@link Pattern }
     */
    @objid ("1697b4c8-30a0-4496-be3b-b28642217f2e")
    public Pattern createPattern() {
        return new Pattern();
    }

}
