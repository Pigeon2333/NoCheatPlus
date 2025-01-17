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
package net.catrainbow.nocheatplus.components.config

import cn.nukkit.utils.Config
import net.catrainbow.nocheatplus.NoCheatPlus
import net.catrainbow.nocheatplus.components.registry.INCPComponent
import net.catrainbow.nocheatplus.components.registry.NCPComponent

/**
 * 封禁数据储存
 *
 * @author Catrainbow
 */
class NCPBanConfig : NCPComponent(), INCPComponent {

    override fun onEnabled() {
        this.getRegisterCom().setName("NCP AutoBan")
        this.getRegisterCom().setVersion("1.0.0")
        this.getRegisterCom().setAuthor("Catrainbow")
        NoCheatPlus.instance.saveResource("banRecord.yml")
    }

    fun getRecord(): Config {
        return Config("${NoCheatPlus.instance.dataFolder}/banRecord.yml", 2)
    }

}