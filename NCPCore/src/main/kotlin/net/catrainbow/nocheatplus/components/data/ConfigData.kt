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
package net.catrainbow.nocheatplus.components.data

/**
 * 配置文件储存
 */
class ConfigData : IConfigData {

    companion object {

        var config_version_notify = false
        var config_version_version = 1000
        var logging_active = false
        var logging_auto_delete_days = 1
        var logging_command = false
        var logging_violation = false
        var action_waring_delay = 10
        var protection_command_hide_active = true
        var protection_command_hide_message = "§c§lNCP §7>> §rYou do not have permission to run this command."
        var protection_command_commands: ArrayList<String> = ArrayList()
        var string_kick_message = "§c§lNCP §7>> §rYou are kicked by NCP because of using @hack on server"

    }

}