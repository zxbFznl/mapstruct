/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package org.mapstruct.ap.test.references;

/**
 * @author Andreas Gudian
 *
 */
public class SomeOtherType extends BaseType {
    private String value;

    public SomeOtherType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ( ( value == null ) ? 0 : value.hashCode() );
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if ( this == obj ) {
            return true;
        }
        if ( obj == null ) {
            return false;
        }
        if ( getClass() != obj.getClass() ) {
            return false;
        }
        SomeOtherType other = (SomeOtherType) obj;
        if ( value == null ) {
            return other.value == null;
        }
        else {
            return value.equals( other.value );
        }
    }
}
