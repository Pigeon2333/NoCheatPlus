/*
 * This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in thCut even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package net.catrainbow.nocheatplus.actions

import cn.nukkit.level.Location
import net.catrainbow.nocheatplus.NoCheatPlus
import net.catrainbow.nocheatplus.checks.moving.location.setback.SetBackEntry

/**
 * 保存处罚记录
 *
 * @author Catrainbow
 */
class ActionHistory {

    private var lastWaring: Long = System.currentTimeMillis()
    private var lastCancel: Long = System.currentTimeMillis()
    private var lastLog: Long = System.currentTimeMillis();
    private var historySetback: SetBackEntry = SetBackEntry(
        Location.fromObject(NoCheatPlus.instance.server.defaultLevel.spawnLocation), 0
    )

    fun setLastSetBack(entry: SetBackEntry) {
        this.historySetback = entry
        this.lastCancel = System.currentTimeMillis()
    }

    fun getLastLog(): Long {
        return this.lastLog
    }

    fun setLastLog(access: Long) {
        this.lastLog = access
    }

    fun getLastWaring(): Long {
        return this.lastWaring
    }

    fun setLastWaring(access: Long) {
        this.lastWaring = access
    }

}