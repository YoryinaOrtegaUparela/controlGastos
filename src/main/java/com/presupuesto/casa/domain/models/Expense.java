package com.presupuesto.casa.domain.models;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;

public class Expense {
    private LocalDateTime executeExpenseDate;
    private Long amount;
    private User user;
    private Category category;
    private Boolean fixedExpense;
    // TODO información del link de pago y NIC del recibo
    private String resource;
    private Boolean isDivisible;

    @Override
    public String toString() {
        return "Expense{" +
                "executeExpenseDate=" + executeExpenseDate +
                ", amount=" + amount +
                ", user=" + user +
                ", category=" + category +
                ", fixedExpense=" + fixedExpense +
                ", resource='" + resource + '\'' +
                ", isDivisible=" + isDivisible +
                '}';
    }

    public Expense(BuilderExpense builderExpense) {
        this.executeExpenseDate = builderExpense.executeExpenseDate;
        this.amount = builderExpense.amount;
        this.user = builderExpense.user;
        this.category = builderExpense.category;
        this.fixedExpense = builderExpense.fixedExpense;
        this.resource = builderExpense.resource;
        this.isDivisible = builderExpense.isDivisible;
    }

    public static class BuilderExpense {
        private LocalDateTime executeExpenseDate;
        private Long amount;
        private User user;
        private Category category;
        private Boolean fixedExpense;
        private String resource;
        private Boolean isDivisible;

        public BuilderExpense setExecuteExpenseDate(LocalDateTime executeExpenseDate) {
            this.executeExpenseDate = executeExpenseDate;
            return this;
        }

        public BuilderExpense setAmount(Long amount) {
            this.amount = amount;
            return this;
        }

        public BuilderExpense setUser(User user) {
            this.user = user;
            return this;
        }

        public BuilderExpense setCategory(Category category) {
            this.category = category;
            return this;
        }

        public BuilderExpense setFixedExpense(Boolean fixedExpense) {
            this.fixedExpense = fixedExpense;
            return this;
        }

        public BuilderExpense setResource(String resource) {
            this.resource = resource;
            return this;
        }

        public BuilderExpense setDivisible(Boolean divisible) {
            isDivisible = divisible;
            return this;
        }

        public Expense build() {
            return new Expense(this);
        }
    }
}
