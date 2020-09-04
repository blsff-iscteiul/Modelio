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
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.12.02 at 02:29:48 PM CET
//
package org.modelio.bpmnxml.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * <p>Java class for Diagram complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Diagram">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 * &lt;attribute name="documentation" type="{http://www.w3.org/2001/XMLSchema}string" />
 * &lt;attribute name="resolution" type="{http://www.w3.org/2001/XMLSchema}double" />
 * &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@objid ("8fc5329a-848e-49bd-87f7-2388e8cbb111")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Diagram", namespace = "http://www.omg.org/spec/DD/20100524/DI")
@XmlSeeAlso({
    BPMNDiagram.class
})
public abstract class Diagram {
    @objid ("0ad374eb-30f7-4095-afd7-2161fbee4b54")
    @XmlAttribute(name = "name")
    protected String name;

    @objid ("81401ad2-1cbe-49fd-88ff-d58258e6738d")
    @XmlAttribute(name = "documentation")
    protected String documentation;

    @objid ("cbf8bc9a-be5a-4842-9523-aa591f0a0068")
    @XmlAttribute(name = "resolution")
    protected Double resolution;

    @objid ("48513ea4-9b33-49a2-9e86-05c6f2a7b5fa")
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the name property.
     * @return
     * possible object is
     * {@link String }
     */
    @objid ("c8ec1f01-d50d-4bd8-806d-f1e443899c06")
    public String getName() {
        return this.name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value allowed object is
     * {@link String }
     */
    @objid ("7b3147d4-e576-4db9-83e7-cba7bd5fc5c0")
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the documentation property.
     * @return
     * possible object is
     * {@link String }
     */
    @objid ("e7078429-a001-47c5-a91b-2795967b8f2b")
    public String getDocumentation() {
        return this.documentation;
    }

    /**
     * Sets the value of the documentation property.
     * 
     * @param value allowed object is
     * {@link String }
     */
    @objid ("2343b11e-147c-4cb8-ab50-31b83c92f291")
    public void setDocumentation(String value) {
        this.documentation = value;
    }

    /**
     * Gets the value of the resolution property.
     * @return
     * possible object is
     * {@link Double }
     */
    @objid ("fbce7372-6b86-4a52-8480-a791f8f19b1e")
    public Double getResolution() {
        return this.resolution;
    }

    /**
     * Sets the value of the resolution property.
     * 
     * @param value allowed object is
     * {@link Double }
     */
    @objid ("684487d2-53fc-4579-94d0-3c6ae4fa7857")
    public void setResolution(Double value) {
        this.resolution = value;
    }

    /**
     * Gets the value of the id property.
     * @return
     * possible object is
     * {@link String }
     */
    @objid ("1f97bd75-ca3d-489e-924f-144bc406d7a4")
    public String getId() {
        return this.id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value allowed object is
     * {@link String }
     */
    @objid ("183b52e1-2c36-43ae-9f53-9d6da861ffe0")
    public void setId(String value) {
        this.id = value;
    }

}
