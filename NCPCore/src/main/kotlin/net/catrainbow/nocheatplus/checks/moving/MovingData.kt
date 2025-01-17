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

package net.catrainbow.nocheatplus.checks.moving

import cn.nukkit.Player
import cn.nukkit.level.Location
import cn.nukkit.level.Position
import net.catrainbow.nocheatplus.NoCheatPlus
import net.catrainbow.nocheatplus.checks.moving.model.DistanceData
import net.catrainbow.nocheatplus.checks.moving.util.MovingUtil
import net.catrainbow.nocheatplus.components.data.ICheckData

/**
 * 移动数据储存
 *
 * @author Catrainbow
 */
class MovingData : ICheckData {

    /**
     * Moving Data History
     */
    private var lastOnGround = false
    private var onGround = false
    private var lastLocation: Location = Location.fromObject(NoCheatPlus.instance.server.defaultLevel.spawnLocation)
    private var location: Location = Location.fromObject(NoCheatPlus.instance.server.defaultLevel.spawnLocation)
    private var distanceData: DistanceData = DistanceData(Position(0.0, 0.0, 0.0), Position(0.0, 0.0, 0.0))
    private var lastMotionX = 0.0
    private var lastMotionY = 0.0
    private var lastMotionZ = 0.0
    private var lastSpeed = 0.0

    /**
     * Current Moving Data
     */
    private var from: Location = Location.fromObject(NoCheatPlus.instance.server.defaultLevel.spawnLocation)
    private var to: Location = Location.fromObject(NoCheatPlus.instance.server.defaultLevel.spawnLocation)
    private var motionX = 0.0
    private var motionY = 0.0
    private var motionZ = 0.0
    private var speed = 0.0


    /**
     * 处理数据
     */
    fun handleMovingData(player: Player, from: Location, to: Location, data: DistanceData) {
        this.lastOnGround = onGround
        this.lastLocation = location
        this.lastSpeed = speed
        this.lastMotionX = motionX
        this.lastMotionY = motionY
        this.lastMotionZ = motionZ
        this.location = player.location
        this.onGround = player.onGround
        this.from = from
        this.to = to
        this.distanceData = data
        this.motionX = MovingUtil.roundDouble(to.x - from.x, 4)
        this.motionY = MovingUtil.roundDouble(to.y - from.y, 4)
        this.motionZ = MovingUtil.roundDouble(to.z - from.z, 4)
        this.speed = to.distance(from)
    }

    fun getMotionX(): Double {
        return this.motionX
    }

    fun getMotionY(): Double {
        return this.motionY
    }

    fun getMotionZ(): Double {
        return this.motionZ
    }

    fun getSpeed(): Double {
        return this.speed
    }

}