package com.github.vbauer.jackdaw;

import com.github.vbauer.jackdaw.annotation.JBuilder;
import com.github.vbauer.jackdaw.annotation.JClassDescriptor;
import com.github.vbauer.jackdaw.annotation.JComparator;
import com.github.vbauer.jackdaw.annotation.JFactoryMethod;
import com.github.vbauer.jackdaw.annotation.JFunction;
import com.github.vbauer.jackdaw.annotation.JPredicate;
import com.github.vbauer.jackdaw.annotation.JSupplier;

import java.util.Set;

import static com.github.vbauer.jackdaw.annotation.type.JPredicateType.COMMONS;

/**
 * @author Vladislav Bauer
 */

@JBuilder
@JClassDescriptor
@JFactoryMethod(all = true)
public class Company {

    @JFunction
    @JComparator(reverse = true)
    private int id;

    @JComparator
    private String name;

    @JSupplier
    private Long revenue;

    @JPredicate(type = COMMONS, reverse = true)
    private boolean listed;

    private Set<String> descriptions;

    @JSupplier
    @JFunction(nullable = false)
    @JPredicate(nullable = false)
    @JComparator(nullable = false)
    public boolean llp;


    public int getId() { return id; }

    public void setId(final int id) {
        this.id = id;
    }

    @JSupplier
    public String getName() { return name; }

    public void setName(final String name) {
        this.name = name;
    }

    @JComparator
    public Long getRevenue() {
        return revenue;
    }

    public void setRevenue(final Long revenue) {
        this.revenue = revenue;
    }

    @JFunction
    public boolean isListed() { return listed; }

    public void setListed(final boolean listed) {
        this.listed = listed;
    }

    @JComparator
    public boolean isListed2(final boolean test) {
        final boolean test2 = getId() > 0;
        return listed || test || test2;
    }

    public Set<String> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(final Set<String> descriptions) {
        this.descriptions = descriptions;
    }

}
