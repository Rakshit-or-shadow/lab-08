package com.example.lab_8

class Wizard(val name: String, var mana: Int, var spellPower: Int) {

    fun castSpell(spell: String): Int {
        when (spell) {
            "Explosion" -> {
                if (mana >= 10) {
                    mana -= 10
                    return spellPower * 3
                } else return 0 // not enough mana
            }

            "Frostbite" -> {
                if (mana >= 5) {
                    mana -= 5
                    return spellPower * 2
                } else return 0 // not enough mana
            }

            else -> {
                return 0 // invalid spell
            }
        }
    }

    // empty on purpose: the tests come first, so they should fail for now
    fun restoreMana(amount: Int) {
        mana = minOf(100, mana + amount)
    }

    fun train() {
        // Only train if we have at least 5 mana
        if (mana >= 5) {
            spellPower += 1 // get stronger
            mana -= 5       // training costs 5 mana
        }
    }
}