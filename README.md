# Hack_U_2019

Hack U 2019に用いるソースコードやcsv形式データの置き場

## src

- Average.java : サーバーサイドで保持するJSONと同じ名前をフィールドを持つクラス
- Colorpoint.java：3群の点数から栄養バランスの良い・悪いのパラメータ計算
- Colorcheck.java：3群点数や塩分を用いた健康状態のパラメータ計算
- Front.java：フロントエンド側に送るJSONと同じ名前をフィールドを持つクラス
- Main.java：各クラスのメイン関数
- Menu_prop.java：3群点数計算の結果に対して、おすすめメニューの返却
- Read_json.java：ローカルのJSONファイルから必要なパラメータを受け取るクラス
- Send_average.java：サーバーサイドで保持するJSON形式のString型に変換するクラス
- Send_front.java：フロントエンド側に送るJSON形式のString型に変換するクラス
- Send_unity.java：Unity側に送るJSON形式のString型に変換するクラス
- Shape.java：カロリー摂取量からキャラの体型変化のパラメータ計算
- Sleep.java：睡眠時間の計算と、その影響度パラメータの計算
- sqlwrite.py, sqlwrite1.py：SQLテーブルの書き込みを行うプログラム
- Unity.java：Unity側に送るJSONと同じ名前をフィールドを持つクラス