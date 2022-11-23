https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder
/* Copyright (C) 2015, 2022 Paul N. Hilfinger and the Regents of the
 * University of California.  All rights reserved. */
package gitlet;

import java.io.Serializable;

/** An interface describing dumpable objects.
 *  @author P. N. Hilfinger
 */
interface Dumpable extends Serializable {
    /** Print useful information about this object on System.out. */
    void dump();
}
