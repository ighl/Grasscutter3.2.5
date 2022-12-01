// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Message;
import java.io.InputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ByteString;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import java.util.Collections;
import com.google.protobuf.Parser;
import com.google.protobuf.Internal;
import java.util.List;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class GachaInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_GachaInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GachaInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private GachaInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return GachaInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u000fGachaInfo.proto\u001a\u0011GachaUpInfo.proto\" \u0005\n\tGachaInfo\u0012\u0012\n\ngacha_type\u0018\r \u0001(\r\u0012\u0013\n\u000bschedule_id\u0018\n \u0001(\r\u0012\u0012\n\nbegin_time\u0018\u0001 \u0001(\r\u0012\u0010\n\bend_time\u0018\u000e \u0001(\r\u0012\u0014\n\fcost_item_id\u0018\t \u0001(\r\u0012\u0015\n\rcost_item_num\u0018\u0003 \u0001(\r\u0012\u0019\n\u0011gacha_prefab_path\u0018\u000f \u0001(\t\u0012\u0016\n\u000egacha_prob_url\u0018\b \u0001(\t\u0012\u0018\n\u0010gacha_record_url\u0018\f \u0001(\t\u0012!\n\u0019gacha_preview_prefab_path\u0018\u0004 \u0001(\t\u0012\u0018\n\u0010ten_cost_item_id\u0018\u0002 \u0001(\r\u0012\u0019\n\u0011ten_cost_item_num\u0018\u0006 \u0001(\r\u0012\u0018\n\u0010left_gacha_times\u0018\u0005 \u0001(\r\u0012\u0019\n\u0011gacha_times_limit\u0018\u000b \u0001(\r\u0012\u0015\n\rgacha_sort_id\u0018\u0007 \u0001(\r\u0012\u001f\n\u0016gacha_prob_url_oversea\u0018\u00c9\u000b \u0001(\t\u0012!\n\u0018gacha_record_url_oversea\u0018¾\u000e \u0001(\t\u0012)\n\u0012gacha_up_info_list\u0018\u00d1\t \u0003(\u000b2\f.GachaUpInfo\u0012\u0016\n\rtitle_textmap\u0018\u00e0\u0005 \u0001(\t\u0012\u001e\n\u0015display_up5_item_list\u0018\u00d6\u000f \u0003(\r\u0012\u001e\n\u0015display_up4_item_list\u0018\u00d3\u000e \u0003(\r\u0012\u0015\n\fwish_item_id\u0018\u00e5\f \u0001(\r\u0012\u0016\n\rwish_progress\u0018\u009b\u000e \u0001(\r\u0012\u001a\n\u0011wish_max_progress\u0018\u00c6\t \u0001(\r\u0012\u0014\n\u000bis_new_wish\u0018\u00dd\u0005 \u0001(\bB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        GachaInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { GachaUpInfoOuterClass.getDescriptor() });
        internal_static_GachaInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_GachaInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(GachaInfoOuterClass.internal_static_GachaInfo_descriptor, new String[] { "GachaType", "ScheduleId", "BeginTime", "EndTime", "CostItemId", "CostItemNum", "GachaPrefabPath", "GachaProbUrl", "GachaRecordUrl", "GachaPreviewPrefabPath", "TenCostItemId", "TenCostItemNum", "LeftGachaTimes", "GachaTimesLimit", "GachaSortId", "GachaProbUrlOversea", "GachaRecordUrlOversea", "GachaUpInfoList", "TitleTextmap", "DisplayUp5ItemList", "DisplayUp4ItemList", "WishItemId", "WishProgress", "WishMaxProgress", "IsNewWish" });
        GachaUpInfoOuterClass.getDescriptor();
    }
    
    public static final class GachaInfo extends GeneratedMessageV3 implements GachaInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int GACHA_TYPE_FIELD_NUMBER = 13;
        private int gachaType_;
        public static final int SCHEDULE_ID_FIELD_NUMBER = 10;
        private int scheduleId_;
        public static final int BEGIN_TIME_FIELD_NUMBER = 1;
        private int beginTime_;
        public static final int END_TIME_FIELD_NUMBER = 14;
        private int endTime_;
        public static final int COST_ITEM_ID_FIELD_NUMBER = 9;
        private int costItemId_;
        public static final int COST_ITEM_NUM_FIELD_NUMBER = 3;
        private int costItemNum_;
        public static final int GACHA_PREFAB_PATH_FIELD_NUMBER = 15;
        private volatile Object gachaPrefabPath_;
        public static final int GACHA_PROB_URL_FIELD_NUMBER = 8;
        private volatile Object gachaProbUrl_;
        public static final int GACHA_RECORD_URL_FIELD_NUMBER = 12;
        private volatile Object gachaRecordUrl_;
        public static final int GACHA_PREVIEW_PREFAB_PATH_FIELD_NUMBER = 4;
        private volatile Object gachaPreviewPrefabPath_;
        public static final int TEN_COST_ITEM_ID_FIELD_NUMBER = 2;
        private int tenCostItemId_;
        public static final int TEN_COST_ITEM_NUM_FIELD_NUMBER = 6;
        private int tenCostItemNum_;
        public static final int LEFT_GACHA_TIMES_FIELD_NUMBER = 5;
        private int leftGachaTimes_;
        public static final int GACHA_TIMES_LIMIT_FIELD_NUMBER = 11;
        private int gachaTimesLimit_;
        public static final int GACHA_SORT_ID_FIELD_NUMBER = 7;
        private int gachaSortId_;
        public static final int GACHA_PROB_URL_OVERSEA_FIELD_NUMBER = 1481;
        private volatile Object gachaProbUrlOversea_;
        public static final int GACHA_RECORD_URL_OVERSEA_FIELD_NUMBER = 1854;
        private volatile Object gachaRecordUrlOversea_;
        public static final int GACHA_UP_INFO_LIST_FIELD_NUMBER = 1233;
        private List<GachaUpInfoOuterClass.GachaUpInfo> gachaUpInfoList_;
        public static final int TITLE_TEXTMAP_FIELD_NUMBER = 736;
        private volatile Object titleTextmap_;
        public static final int DISPLAY_UP5_ITEM_LIST_FIELD_NUMBER = 2006;
        private Internal.IntList displayUp5ItemList_;
        private int displayUp5ItemListMemoizedSerializedSize;
        public static final int DISPLAY_UP4_ITEM_LIST_FIELD_NUMBER = 1875;
        private Internal.IntList displayUp4ItemList_;
        private int displayUp4ItemListMemoizedSerializedSize;
        public static final int WISH_ITEM_ID_FIELD_NUMBER = 1637;
        private int wishItemId_;
        public static final int WISH_PROGRESS_FIELD_NUMBER = 1819;
        private int wishProgress_;
        public static final int WISH_MAX_PROGRESS_FIELD_NUMBER = 1222;
        private int wishMaxProgress_;
        public static final int IS_NEW_WISH_FIELD_NUMBER = 733;
        private boolean isNewWish_;
        private byte memoizedIsInitialized;
        private static final GachaInfo DEFAULT_INSTANCE;
        private static final Parser<GachaInfo> PARSER;
        
        private GachaInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.displayUp5ItemListMemoizedSerializedSize = -1;
            this.displayUp4ItemListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private GachaInfo() {
            this.displayUp5ItemListMemoizedSerializedSize = -1;
            this.displayUp4ItemListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.gachaPrefabPath_ = "";
            this.gachaProbUrl_ = "";
            this.gachaRecordUrl_ = "";
            this.gachaPreviewPrefabPath_ = "";
            this.gachaProbUrlOversea_ = "";
            this.gachaRecordUrlOversea_ = "";
            this.gachaUpInfoList_ = Collections.emptyList();
            this.titleTextmap_ = "";
            this.displayUp5ItemList_ = GeneratedMessageV3.emptyIntList();
            this.displayUp4ItemList_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new GachaInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private GachaInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
            int mutable_bitField0_ = 0;
            final UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    final int tag = input.readTag();
                    switch (tag) {
                        case 0: {
                            done = true;
                            continue;
                        }
                        case 8: {
                            this.beginTime_ = input.readUInt32();
                            continue;
                        }
                        case 16: {
                            this.tenCostItemId_ = input.readUInt32();
                            continue;
                        }
                        case 24: {
                            this.costItemNum_ = input.readUInt32();
                            continue;
                        }
                        case 34: {
                            final String s = input.readStringRequireUtf8();
                            this.gachaPreviewPrefabPath_ = s;
                            continue;
                        }
                        case 40: {
                            this.leftGachaTimes_ = input.readUInt32();
                            continue;
                        }
                        case 48: {
                            this.tenCostItemNum_ = input.readUInt32();
                            continue;
                        }
                        case 56: {
                            this.gachaSortId_ = input.readUInt32();
                            continue;
                        }
                        case 66: {
                            final String s = input.readStringRequireUtf8();
                            this.gachaProbUrl_ = s;
                            continue;
                        }
                        case 72: {
                            this.costItemId_ = input.readUInt32();
                            continue;
                        }
                        case 80: {
                            this.scheduleId_ = input.readUInt32();
                            continue;
                        }
                        case 88: {
                            this.gachaTimesLimit_ = input.readUInt32();
                            continue;
                        }
                        case 98: {
                            final String s = input.readStringRequireUtf8();
                            this.gachaRecordUrl_ = s;
                            continue;
                        }
                        case 104: {
                            this.gachaType_ = input.readUInt32();
                            continue;
                        }
                        case 112: {
                            this.endTime_ = input.readUInt32();
                            continue;
                        }
                        case 122: {
                            final String s = input.readStringRequireUtf8();
                            this.gachaPrefabPath_ = s;
                            continue;
                        }
                        case 5864: {
                            this.isNewWish_ = input.readBool();
                            continue;
                        }
                        case 5890: {
                            final String s = input.readStringRequireUtf8();
                            this.titleTextmap_ = s;
                            continue;
                        }
                        case 9776: {
                            this.wishMaxProgress_ = input.readUInt32();
                            continue;
                        }
                        case 9866: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.gachaUpInfoList_ = new ArrayList<GachaUpInfoOuterClass.GachaUpInfo>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.gachaUpInfoList_.add(input.readMessage(GachaUpInfoOuterClass.GachaUpInfo.parser(), extensionRegistry));
                            continue;
                        }
                        case 11850: {
                            final String s = input.readStringRequireUtf8();
                            this.gachaProbUrlOversea_ = s;
                            continue;
                        }
                        case 13096: {
                            this.wishItemId_ = input.readUInt32();
                            continue;
                        }
                        case 14552: {
                            this.wishProgress_ = input.readUInt32();
                            continue;
                        }
                        case 14834: {
                            final String s = input.readStringRequireUtf8();
                            this.gachaRecordUrlOversea_ = s;
                            continue;
                        }
                        case 15000: {
                            if ((mutable_bitField0_ & 0x4) == 0x0) {
                                this.displayUp4ItemList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x4;
                            }
                            this.displayUp4ItemList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 15002: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x4) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.displayUp4ItemList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x4;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.displayUp4ItemList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 16048: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.displayUp5ItemList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x2;
                            }
                            this.displayUp5ItemList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 16050: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x2) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.displayUp5ItemList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x2;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.displayUp5ItemList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        default: {
                            if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                                continue;
                            }
                            continue;
                        }
                    }
                }
            }
            catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            }
            catch (IOException e2) {
                throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
            }
            finally {
                if ((mutable_bitField0_ & 0x1) != 0x0) {
                    this.gachaUpInfoList_ = Collections.unmodifiableList((List<? extends GachaUpInfoOuterClass.GachaUpInfo>)this.gachaUpInfoList_);
                }
                if ((mutable_bitField0_ & 0x4) != 0x0) {
                    this.displayUp4ItemList_.makeImmutable();
                }
                if ((mutable_bitField0_ & 0x2) != 0x0) {
                    this.displayUp5ItemList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return GachaInfoOuterClass.internal_static_GachaInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return GachaInfoOuterClass.internal_static_GachaInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(GachaInfo.class, Builder.class);
        }
        
        @Override
        public int getGachaType() {
            return this.gachaType_;
        }
        
        @Override
        public int getScheduleId() {
            return this.scheduleId_;
        }
        
        @Override
        public int getBeginTime() {
            return this.beginTime_;
        }
        
        @Override
        public int getEndTime() {
            return this.endTime_;
        }
        
        @Override
        public int getCostItemId() {
            return this.costItemId_;
        }
        
        @Override
        public int getCostItemNum() {
            return this.costItemNum_;
        }
        
        @Override
        public String getGachaPrefabPath() {
            final Object ref = this.gachaPrefabPath_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.gachaPrefabPath_ = s);
        }
        
        @Override
        public ByteString getGachaPrefabPathBytes() {
            final Object ref = this.gachaPrefabPath_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.gachaPrefabPath_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public String getGachaProbUrl() {
            final Object ref = this.gachaProbUrl_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.gachaProbUrl_ = s);
        }
        
        @Override
        public ByteString getGachaProbUrlBytes() {
            final Object ref = this.gachaProbUrl_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.gachaProbUrl_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public String getGachaRecordUrl() {
            final Object ref = this.gachaRecordUrl_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.gachaRecordUrl_ = s);
        }
        
        @Override
        public ByteString getGachaRecordUrlBytes() {
            final Object ref = this.gachaRecordUrl_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.gachaRecordUrl_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public String getGachaPreviewPrefabPath() {
            final Object ref = this.gachaPreviewPrefabPath_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.gachaPreviewPrefabPath_ = s);
        }
        
        @Override
        public ByteString getGachaPreviewPrefabPathBytes() {
            final Object ref = this.gachaPreviewPrefabPath_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.gachaPreviewPrefabPath_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public int getTenCostItemId() {
            return this.tenCostItemId_;
        }
        
        @Override
        public int getTenCostItemNum() {
            return this.tenCostItemNum_;
        }
        
        @Override
        public int getLeftGachaTimes() {
            return this.leftGachaTimes_;
        }
        
        @Override
        public int getGachaTimesLimit() {
            return this.gachaTimesLimit_;
        }
        
        @Override
        public int getGachaSortId() {
            return this.gachaSortId_;
        }
        
        @Override
        public String getGachaProbUrlOversea() {
            final Object ref = this.gachaProbUrlOversea_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.gachaProbUrlOversea_ = s);
        }
        
        @Override
        public ByteString getGachaProbUrlOverseaBytes() {
            final Object ref = this.gachaProbUrlOversea_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.gachaProbUrlOversea_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public String getGachaRecordUrlOversea() {
            final Object ref = this.gachaRecordUrlOversea_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.gachaRecordUrlOversea_ = s);
        }
        
        @Override
        public ByteString getGachaRecordUrlOverseaBytes() {
            final Object ref = this.gachaRecordUrlOversea_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.gachaRecordUrlOversea_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public List<GachaUpInfoOuterClass.GachaUpInfo> getGachaUpInfoListList() {
            return this.gachaUpInfoList_;
        }
        
        @Override
        public List<? extends GachaUpInfoOuterClass.GachaUpInfoOrBuilder> getGachaUpInfoListOrBuilderList() {
            return this.gachaUpInfoList_;
        }
        
        @Override
        public int getGachaUpInfoListCount() {
            return this.gachaUpInfoList_.size();
        }
        
        @Override
        public GachaUpInfoOuterClass.GachaUpInfo getGachaUpInfoList(final int index) {
            return this.gachaUpInfoList_.get(index);
        }
        
        @Override
        public GachaUpInfoOuterClass.GachaUpInfoOrBuilder getGachaUpInfoListOrBuilder(final int index) {
            return this.gachaUpInfoList_.get(index);
        }
        
        @Override
        public String getTitleTextmap() {
            final Object ref = this.titleTextmap_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.titleTextmap_ = s);
        }
        
        @Override
        public ByteString getTitleTextmapBytes() {
            final Object ref = this.titleTextmap_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.titleTextmap_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public List<Integer> getDisplayUp5ItemListList() {
            return this.displayUp5ItemList_;
        }
        
        @Override
        public int getDisplayUp5ItemListCount() {
            return this.displayUp5ItemList_.size();
        }
        
        @Override
        public int getDisplayUp5ItemList(final int index) {
            return this.displayUp5ItemList_.getInt(index);
        }
        
        @Override
        public List<Integer> getDisplayUp4ItemListList() {
            return this.displayUp4ItemList_;
        }
        
        @Override
        public int getDisplayUp4ItemListCount() {
            return this.displayUp4ItemList_.size();
        }
        
        @Override
        public int getDisplayUp4ItemList(final int index) {
            return this.displayUp4ItemList_.getInt(index);
        }
        
        @Override
        public int getWishItemId() {
            return this.wishItemId_;
        }
        
        @Override
        public int getWishProgress() {
            return this.wishProgress_;
        }
        
        @Override
        public int getWishMaxProgress() {
            return this.wishMaxProgress_;
        }
        
        @Override
        public boolean getIsNewWish() {
            return this.isNewWish_;
        }
        
        @Override
        public final boolean isInitialized() {
            final byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            }
            if (isInitialized == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }
        
        @Override
        public void writeTo(final CodedOutputStream output) throws IOException {
            this.getSerializedSize();
            if (this.beginTime_ != 0) {
                output.writeUInt32(1, this.beginTime_);
            }
            if (this.tenCostItemId_ != 0) {
                output.writeUInt32(2, this.tenCostItemId_);
            }
            if (this.costItemNum_ != 0) {
                output.writeUInt32(3, this.costItemNum_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.gachaPreviewPrefabPath_)) {
                GeneratedMessageV3.writeString(output, 4, this.gachaPreviewPrefabPath_);
            }
            if (this.leftGachaTimes_ != 0) {
                output.writeUInt32(5, this.leftGachaTimes_);
            }
            if (this.tenCostItemNum_ != 0) {
                output.writeUInt32(6, this.tenCostItemNum_);
            }
            if (this.gachaSortId_ != 0) {
                output.writeUInt32(7, this.gachaSortId_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.gachaProbUrl_)) {
                GeneratedMessageV3.writeString(output, 8, this.gachaProbUrl_);
            }
            if (this.costItemId_ != 0) {
                output.writeUInt32(9, this.costItemId_);
            }
            if (this.scheduleId_ != 0) {
                output.writeUInt32(10, this.scheduleId_);
            }
            if (this.gachaTimesLimit_ != 0) {
                output.writeUInt32(11, this.gachaTimesLimit_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.gachaRecordUrl_)) {
                GeneratedMessageV3.writeString(output, 12, this.gachaRecordUrl_);
            }
            if (this.gachaType_ != 0) {
                output.writeUInt32(13, this.gachaType_);
            }
            if (this.endTime_ != 0) {
                output.writeUInt32(14, this.endTime_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.gachaPrefabPath_)) {
                GeneratedMessageV3.writeString(output, 15, this.gachaPrefabPath_);
            }
            if (this.isNewWish_) {
                output.writeBool(733, this.isNewWish_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.titleTextmap_)) {
                GeneratedMessageV3.writeString(output, 736, this.titleTextmap_);
            }
            if (this.wishMaxProgress_ != 0) {
                output.writeUInt32(1222, this.wishMaxProgress_);
            }
            for (int i = 0; i < this.gachaUpInfoList_.size(); ++i) {
                output.writeMessage(1233, this.gachaUpInfoList_.get(i));
            }
            if (!GeneratedMessageV3.isStringEmpty(this.gachaProbUrlOversea_)) {
                GeneratedMessageV3.writeString(output, 1481, this.gachaProbUrlOversea_);
            }
            if (this.wishItemId_ != 0) {
                output.writeUInt32(1637, this.wishItemId_);
            }
            if (this.wishProgress_ != 0) {
                output.writeUInt32(1819, this.wishProgress_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.gachaRecordUrlOversea_)) {
                GeneratedMessageV3.writeString(output, 1854, this.gachaRecordUrlOversea_);
            }
            if (this.getDisplayUp4ItemListList().size() > 0) {
                output.writeUInt32NoTag(15002);
                output.writeUInt32NoTag(this.displayUp4ItemListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.displayUp4ItemList_.size(); ++i) {
                output.writeUInt32NoTag(this.displayUp4ItemList_.getInt(i));
            }
            if (this.getDisplayUp5ItemListList().size() > 0) {
                output.writeUInt32NoTag(16050);
                output.writeUInt32NoTag(this.displayUp5ItemListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.displayUp5ItemList_.size(); ++i) {
                output.writeUInt32NoTag(this.displayUp5ItemList_.getInt(i));
            }
            this.unknownFields.writeTo(output);
        }
        
        @Override
        public int getSerializedSize() {
            int size = this.memoizedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            if (this.beginTime_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.beginTime_);
            }
            if (this.tenCostItemId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.tenCostItemId_);
            }
            if (this.costItemNum_ != 0) {
                size += CodedOutputStream.computeUInt32Size(3, this.costItemNum_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.gachaPreviewPrefabPath_)) {
                size += GeneratedMessageV3.computeStringSize(4, this.gachaPreviewPrefabPath_);
            }
            if (this.leftGachaTimes_ != 0) {
                size += CodedOutputStream.computeUInt32Size(5, this.leftGachaTimes_);
            }
            if (this.tenCostItemNum_ != 0) {
                size += CodedOutputStream.computeUInt32Size(6, this.tenCostItemNum_);
            }
            if (this.gachaSortId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(7, this.gachaSortId_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.gachaProbUrl_)) {
                size += GeneratedMessageV3.computeStringSize(8, this.gachaProbUrl_);
            }
            if (this.costItemId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(9, this.costItemId_);
            }
            if (this.scheduleId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(10, this.scheduleId_);
            }
            if (this.gachaTimesLimit_ != 0) {
                size += CodedOutputStream.computeUInt32Size(11, this.gachaTimesLimit_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.gachaRecordUrl_)) {
                size += GeneratedMessageV3.computeStringSize(12, this.gachaRecordUrl_);
            }
            if (this.gachaType_ != 0) {
                size += CodedOutputStream.computeUInt32Size(13, this.gachaType_);
            }
            if (this.endTime_ != 0) {
                size += CodedOutputStream.computeUInt32Size(14, this.endTime_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.gachaPrefabPath_)) {
                size += GeneratedMessageV3.computeStringSize(15, this.gachaPrefabPath_);
            }
            if (this.isNewWish_) {
                size += CodedOutputStream.computeBoolSize(733, this.isNewWish_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.titleTextmap_)) {
                size += GeneratedMessageV3.computeStringSize(736, this.titleTextmap_);
            }
            if (this.wishMaxProgress_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1222, this.wishMaxProgress_);
            }
            for (int i = 0; i < this.gachaUpInfoList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(1233, this.gachaUpInfoList_.get(i));
            }
            if (!GeneratedMessageV3.isStringEmpty(this.gachaProbUrlOversea_)) {
                size += GeneratedMessageV3.computeStringSize(1481, this.gachaProbUrlOversea_);
            }
            if (this.wishItemId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1637, this.wishItemId_);
            }
            if (this.wishProgress_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1819, this.wishProgress_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.gachaRecordUrlOversea_)) {
                size += GeneratedMessageV3.computeStringSize(1854, this.gachaRecordUrlOversea_);
            }
            int dataSize = 0;
            for (int j = 0; j < this.displayUp4ItemList_.size(); ++j) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.displayUp4ItemList_.getInt(j));
            }
            size += dataSize;
            if (!this.getDisplayUp4ItemListList().isEmpty()) {
                size += 2;
                size += CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.displayUp4ItemListMemoizedSerializedSize = dataSize;
            dataSize = 0;
            for (int j = 0; j < this.displayUp5ItemList_.size(); ++j) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.displayUp5ItemList_.getInt(j));
            }
            size += dataSize;
            if (!this.getDisplayUp5ItemListList().isEmpty()) {
                size += 2;
                size += CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.displayUp5ItemListMemoizedSerializedSize = dataSize;
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GachaInfo)) {
                return super.equals(obj);
            }
            final GachaInfo other = (GachaInfo)obj;
            return this.getGachaType() == other.getGachaType() && this.getScheduleId() == other.getScheduleId() && this.getBeginTime() == other.getBeginTime() && this.getEndTime() == other.getEndTime() && this.getCostItemId() == other.getCostItemId() && this.getCostItemNum() == other.getCostItemNum() && this.getGachaPrefabPath().equals(other.getGachaPrefabPath()) && this.getGachaProbUrl().equals(other.getGachaProbUrl()) && this.getGachaRecordUrl().equals(other.getGachaRecordUrl()) && this.getGachaPreviewPrefabPath().equals(other.getGachaPreviewPrefabPath()) && this.getTenCostItemId() == other.getTenCostItemId() && this.getTenCostItemNum() == other.getTenCostItemNum() && this.getLeftGachaTimes() == other.getLeftGachaTimes() && this.getGachaTimesLimit() == other.getGachaTimesLimit() && this.getGachaSortId() == other.getGachaSortId() && this.getGachaProbUrlOversea().equals(other.getGachaProbUrlOversea()) && this.getGachaRecordUrlOversea().equals(other.getGachaRecordUrlOversea()) && this.getGachaUpInfoListList().equals(other.getGachaUpInfoListList()) && this.getTitleTextmap().equals(other.getTitleTextmap()) && this.getDisplayUp5ItemListList().equals(other.getDisplayUp5ItemListList()) && this.getDisplayUp4ItemListList().equals(other.getDisplayUp4ItemListList()) && this.getWishItemId() == other.getWishItemId() && this.getWishProgress() == other.getWishProgress() && this.getWishMaxProgress() == other.getWishMaxProgress() && this.getIsNewWish() == other.getIsNewWish() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 13;
            hash = 53 * hash + this.getGachaType();
            hash = 37 * hash + 10;
            hash = 53 * hash + this.getScheduleId();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getBeginTime();
            hash = 37 * hash + 14;
            hash = 53 * hash + this.getEndTime();
            hash = 37 * hash + 9;
            hash = 53 * hash + this.getCostItemId();
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getCostItemNum();
            hash = 37 * hash + 15;
            hash = 53 * hash + this.getGachaPrefabPath().hashCode();
            hash = 37 * hash + 8;
            hash = 53 * hash + this.getGachaProbUrl().hashCode();
            hash = 37 * hash + 12;
            hash = 53 * hash + this.getGachaRecordUrl().hashCode();
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getGachaPreviewPrefabPath().hashCode();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getTenCostItemId();
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getTenCostItemNum();
            hash = 37 * hash + 5;
            hash = 53 * hash + this.getLeftGachaTimes();
            hash = 37 * hash + 11;
            hash = 53 * hash + this.getGachaTimesLimit();
            hash = 37 * hash + 7;
            hash = 53 * hash + this.getGachaSortId();
            hash = 37 * hash + 1481;
            hash = 53 * hash + this.getGachaProbUrlOversea().hashCode();
            hash = 37 * hash + 1854;
            hash = 53 * hash + this.getGachaRecordUrlOversea().hashCode();
            if (this.getGachaUpInfoListCount() > 0) {
                hash = 37 * hash + 1233;
                hash = 53 * hash + this.getGachaUpInfoListList().hashCode();
            }
            hash = 37 * hash + 736;
            hash = 53 * hash + this.getTitleTextmap().hashCode();
            if (this.getDisplayUp5ItemListCount() > 0) {
                hash = 37 * hash + 2006;
                hash = 53 * hash + this.getDisplayUp5ItemListList().hashCode();
            }
            if (this.getDisplayUp4ItemListCount() > 0) {
                hash = 37 * hash + 1875;
                hash = 53 * hash + this.getDisplayUp4ItemListList().hashCode();
            }
            hash = 37 * hash + 1637;
            hash = 53 * hash + this.getWishItemId();
            hash = 37 * hash + 1819;
            hash = 53 * hash + this.getWishProgress();
            hash = 37 * hash + 1222;
            hash = 53 * hash + this.getWishMaxProgress();
            hash = 37 * hash + 733;
            hash = 53 * hash + Internal.hashBoolean(this.getIsNewWish());
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static GachaInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return GachaInfo.PARSER.parseFrom(data);
        }
        
        public static GachaInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GachaInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GachaInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return GachaInfo.PARSER.parseFrom(data);
        }
        
        public static GachaInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GachaInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GachaInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return GachaInfo.PARSER.parseFrom(data);
        }
        
        public static GachaInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GachaInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GachaInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GachaInfo.PARSER, input);
        }
        
        public static GachaInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GachaInfo.PARSER, input, extensionRegistry);
        }
        
        public static GachaInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GachaInfo.PARSER, input);
        }
        
        public static GachaInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GachaInfo.PARSER, input, extensionRegistry);
        }
        
        public static GachaInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GachaInfo.PARSER, input);
        }
        
        public static GachaInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GachaInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return GachaInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final GachaInfo prototype) {
            return GachaInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == GachaInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static GachaInfo getDefaultInstance() {
            return GachaInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<GachaInfo> parser() {
            return GachaInfo.PARSER;
        }
        
        @Override
        public Parser<GachaInfo> getParserForType() {
            return GachaInfo.PARSER;
        }
        
        @Override
        public GachaInfo getDefaultInstanceForType() {
            return GachaInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new GachaInfo();
            PARSER = new AbstractParser<GachaInfo>() {
                @Override
                public GachaInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new GachaInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GachaInfoOrBuilder
        {
            private int bitField0_;
            private int gachaType_;
            private int scheduleId_;
            private int beginTime_;
            private int endTime_;
            private int costItemId_;
            private int costItemNum_;
            private Object gachaPrefabPath_;
            private Object gachaProbUrl_;
            private Object gachaRecordUrl_;
            private Object gachaPreviewPrefabPath_;
            private int tenCostItemId_;
            private int tenCostItemNum_;
            private int leftGachaTimes_;
            private int gachaTimesLimit_;
            private int gachaSortId_;
            private Object gachaProbUrlOversea_;
            private Object gachaRecordUrlOversea_;
            private List<GachaUpInfoOuterClass.GachaUpInfo> gachaUpInfoList_;
            private RepeatedFieldBuilderV3<GachaUpInfoOuterClass.GachaUpInfo, GachaUpInfoOuterClass.GachaUpInfo.Builder, GachaUpInfoOuterClass.GachaUpInfoOrBuilder> gachaUpInfoListBuilder_;
            private Object titleTextmap_;
            private Internal.IntList displayUp5ItemList_;
            private Internal.IntList displayUp4ItemList_;
            private int wishItemId_;
            private int wishProgress_;
            private int wishMaxProgress_;
            private boolean isNewWish_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return GachaInfoOuterClass.internal_static_GachaInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return GachaInfoOuterClass.internal_static_GachaInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(GachaInfo.class, Builder.class);
            }
            
            private Builder() {
                this.gachaPrefabPath_ = "";
                this.gachaProbUrl_ = "";
                this.gachaRecordUrl_ = "";
                this.gachaPreviewPrefabPath_ = "";
                this.gachaProbUrlOversea_ = "";
                this.gachaRecordUrlOversea_ = "";
                this.gachaUpInfoList_ = Collections.emptyList();
                this.titleTextmap_ = "";
                this.displayUp5ItemList_ = GeneratedMessageV3.emptyIntList();
                this.displayUp4ItemList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.gachaPrefabPath_ = "";
                this.gachaProbUrl_ = "";
                this.gachaRecordUrl_ = "";
                this.gachaPreviewPrefabPath_ = "";
                this.gachaProbUrlOversea_ = "";
                this.gachaRecordUrlOversea_ = "";
                this.gachaUpInfoList_ = Collections.emptyList();
                this.titleTextmap_ = "";
                this.displayUp5ItemList_ = GeneratedMessageV3.emptyIntList();
                this.displayUp4ItemList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (GachaInfo.alwaysUseFieldBuilders) {
                    this.getGachaUpInfoListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.gachaType_ = 0;
                this.scheduleId_ = 0;
                this.beginTime_ = 0;
                this.endTime_ = 0;
                this.costItemId_ = 0;
                this.costItemNum_ = 0;
                this.gachaPrefabPath_ = "";
                this.gachaProbUrl_ = "";
                this.gachaRecordUrl_ = "";
                this.gachaPreviewPrefabPath_ = "";
                this.tenCostItemId_ = 0;
                this.tenCostItemNum_ = 0;
                this.leftGachaTimes_ = 0;
                this.gachaTimesLimit_ = 0;
                this.gachaSortId_ = 0;
                this.gachaProbUrlOversea_ = "";
                this.gachaRecordUrlOversea_ = "";
                if (this.gachaUpInfoListBuilder_ == null) {
                    this.gachaUpInfoList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.gachaUpInfoListBuilder_.clear();
                }
                this.titleTextmap_ = "";
                this.displayUp5ItemList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFD;
                this.displayUp4ItemList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFB;
                this.wishItemId_ = 0;
                this.wishProgress_ = 0;
                this.wishMaxProgress_ = 0;
                this.isNewWish_ = false;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return GachaInfoOuterClass.internal_static_GachaInfo_descriptor;
            }
            
            @Override
            public GachaInfo getDefaultInstanceForType() {
                return GachaInfo.getDefaultInstance();
            }
            
            @Override
            public GachaInfo build() {
                final GachaInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public GachaInfo buildPartial() {
                final GachaInfo result = new GachaInfo(this);
                final int from_bitField0_ = this.bitField0_;
                result.gachaType_ = this.gachaType_;
                result.scheduleId_ = this.scheduleId_;
                result.beginTime_ = this.beginTime_;
                result.endTime_ = this.endTime_;
                result.costItemId_ = this.costItemId_;
                result.costItemNum_ = this.costItemNum_;
                result.gachaPrefabPath_ = this.gachaPrefabPath_;
                result.gachaProbUrl_ = this.gachaProbUrl_;
                result.gachaRecordUrl_ = this.gachaRecordUrl_;
                result.gachaPreviewPrefabPath_ = this.gachaPreviewPrefabPath_;
                result.tenCostItemId_ = this.tenCostItemId_;
                result.tenCostItemNum_ = this.tenCostItemNum_;
                result.leftGachaTimes_ = this.leftGachaTimes_;
                result.gachaTimesLimit_ = this.gachaTimesLimit_;
                result.gachaSortId_ = this.gachaSortId_;
                result.gachaProbUrlOversea_ = this.gachaProbUrlOversea_;
                result.gachaRecordUrlOversea_ = this.gachaRecordUrlOversea_;
                if (this.gachaUpInfoListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.gachaUpInfoList_ = Collections.unmodifiableList((List<? extends GachaUpInfoOuterClass.GachaUpInfo>)this.gachaUpInfoList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.gachaUpInfoList_ = this.gachaUpInfoList_;
                }
                else {
                    result.gachaUpInfoList_ = this.gachaUpInfoListBuilder_.build();
                }
                result.titleTextmap_ = this.titleTextmap_;
                if ((this.bitField0_ & 0x2) != 0x0) {
                    this.displayUp5ItemList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFD;
                }
                result.displayUp5ItemList_ = this.displayUp5ItemList_;
                if ((this.bitField0_ & 0x4) != 0x0) {
                    this.displayUp4ItemList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFB;
                }
                result.displayUp4ItemList_ = this.displayUp4ItemList_;
                result.wishItemId_ = this.wishItemId_;
                result.wishProgress_ = this.wishProgress_;
                result.wishMaxProgress_ = this.wishMaxProgress_;
                result.isNewWish_ = this.isNewWish_;
                this.onBuilt();
                return result;
            }
            
            @Override
            public Builder clone() {
                return super.clone();
            }
            
            @Override
            public Builder setField(final Descriptors.FieldDescriptor field, final Object value) {
                return super.setField(field, value);
            }
            
            @Override
            public Builder clearField(final Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }
            
            @Override
            public Builder clearOneof(final Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }
            
            @Override
            public Builder setRepeatedField(final Descriptors.FieldDescriptor field, final int index, final Object value) {
                return super.setRepeatedField(field, index, value);
            }
            
            @Override
            public Builder addRepeatedField(final Descriptors.FieldDescriptor field, final Object value) {
                return super.addRepeatedField(field, value);
            }
            
            @Override
            public Builder mergeFrom(final Message other) {
                if (other instanceof GachaInfo) {
                    return this.mergeFrom((GachaInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final GachaInfo other) {
                if (other == GachaInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getGachaType() != 0) {
                    this.setGachaType(other.getGachaType());
                }
                if (other.getScheduleId() != 0) {
                    this.setScheduleId(other.getScheduleId());
                }
                if (other.getBeginTime() != 0) {
                    this.setBeginTime(other.getBeginTime());
                }
                if (other.getEndTime() != 0) {
                    this.setEndTime(other.getEndTime());
                }
                if (other.getCostItemId() != 0) {
                    this.setCostItemId(other.getCostItemId());
                }
                if (other.getCostItemNum() != 0) {
                    this.setCostItemNum(other.getCostItemNum());
                }
                if (!other.getGachaPrefabPath().isEmpty()) {
                    this.gachaPrefabPath_ = other.gachaPrefabPath_;
                    this.onChanged();
                }
                if (!other.getGachaProbUrl().isEmpty()) {
                    this.gachaProbUrl_ = other.gachaProbUrl_;
                    this.onChanged();
                }
                if (!other.getGachaRecordUrl().isEmpty()) {
                    this.gachaRecordUrl_ = other.gachaRecordUrl_;
                    this.onChanged();
                }
                if (!other.getGachaPreviewPrefabPath().isEmpty()) {
                    this.gachaPreviewPrefabPath_ = other.gachaPreviewPrefabPath_;
                    this.onChanged();
                }
                if (other.getTenCostItemId() != 0) {
                    this.setTenCostItemId(other.getTenCostItemId());
                }
                if (other.getTenCostItemNum() != 0) {
                    this.setTenCostItemNum(other.getTenCostItemNum());
                }
                if (other.getLeftGachaTimes() != 0) {
                    this.setLeftGachaTimes(other.getLeftGachaTimes());
                }
                if (other.getGachaTimesLimit() != 0) {
                    this.setGachaTimesLimit(other.getGachaTimesLimit());
                }
                if (other.getGachaSortId() != 0) {
                    this.setGachaSortId(other.getGachaSortId());
                }
                if (!other.getGachaProbUrlOversea().isEmpty()) {
                    this.gachaProbUrlOversea_ = other.gachaProbUrlOversea_;
                    this.onChanged();
                }
                if (!other.getGachaRecordUrlOversea().isEmpty()) {
                    this.gachaRecordUrlOversea_ = other.gachaRecordUrlOversea_;
                    this.onChanged();
                }
                if (this.gachaUpInfoListBuilder_ == null) {
                    if (!other.gachaUpInfoList_.isEmpty()) {
                        if (this.gachaUpInfoList_.isEmpty()) {
                            this.gachaUpInfoList_ = other.gachaUpInfoList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureGachaUpInfoListIsMutable();
                            this.gachaUpInfoList_.addAll(other.gachaUpInfoList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.gachaUpInfoList_.isEmpty()) {
                    if (this.gachaUpInfoListBuilder_.isEmpty()) {
                        this.gachaUpInfoListBuilder_.dispose();
                        this.gachaUpInfoListBuilder_ = null;
                        this.gachaUpInfoList_ = other.gachaUpInfoList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.gachaUpInfoListBuilder_ = (GachaInfo.alwaysUseFieldBuilders ? this.getGachaUpInfoListFieldBuilder() : null);
                    }
                    else {
                        this.gachaUpInfoListBuilder_.addAllMessages(other.gachaUpInfoList_);
                    }
                }
                if (!other.getTitleTextmap().isEmpty()) {
                    this.titleTextmap_ = other.titleTextmap_;
                    this.onChanged();
                }
                if (!other.displayUp5ItemList_.isEmpty()) {
                    if (this.displayUp5ItemList_.isEmpty()) {
                        this.displayUp5ItemList_ = other.displayUp5ItemList_;
                        this.bitField0_ &= 0xFFFFFFFD;
                    }
                    else {
                        this.ensureDisplayUp5ItemListIsMutable();
                        this.displayUp5ItemList_.addAll(other.displayUp5ItemList_);
                    }
                    this.onChanged();
                }
                if (!other.displayUp4ItemList_.isEmpty()) {
                    if (this.displayUp4ItemList_.isEmpty()) {
                        this.displayUp4ItemList_ = other.displayUp4ItemList_;
                        this.bitField0_ &= 0xFFFFFFFB;
                    }
                    else {
                        this.ensureDisplayUp4ItemListIsMutable();
                        this.displayUp4ItemList_.addAll(other.displayUp4ItemList_);
                    }
                    this.onChanged();
                }
                if (other.getWishItemId() != 0) {
                    this.setWishItemId(other.getWishItemId());
                }
                if (other.getWishProgress() != 0) {
                    this.setWishProgress(other.getWishProgress());
                }
                if (other.getWishMaxProgress() != 0) {
                    this.setWishMaxProgress(other.getWishMaxProgress());
                }
                if (other.getIsNewWish()) {
                    this.setIsNewWish(other.getIsNewWish());
                }
                this.mergeUnknownFields(other.unknownFields);
                this.onChanged();
                return this;
            }
            
            @Override
            public final boolean isInitialized() {
                return true;
            }
            
            @Override
            public Builder mergeFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
                GachaInfo parsedMessage = null;
                try {
                    parsedMessage = GachaInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GachaInfo)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            @Override
            public int getGachaType() {
                return this.gachaType_;
            }
            
            public Builder setGachaType(final int value) {
                this.gachaType_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearGachaType() {
                this.gachaType_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getScheduleId() {
                return this.scheduleId_;
            }
            
            public Builder setScheduleId(final int value) {
                this.scheduleId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearScheduleId() {
                this.scheduleId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getBeginTime() {
                return this.beginTime_;
            }
            
            public Builder setBeginTime(final int value) {
                this.beginTime_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearBeginTime() {
                this.beginTime_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getEndTime() {
                return this.endTime_;
            }
            
            public Builder setEndTime(final int value) {
                this.endTime_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearEndTime() {
                this.endTime_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getCostItemId() {
                return this.costItemId_;
            }
            
            public Builder setCostItemId(final int value) {
                this.costItemId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCostItemId() {
                this.costItemId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getCostItemNum() {
                return this.costItemNum_;
            }
            
            public Builder setCostItemNum(final int value) {
                this.costItemNum_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCostItemNum() {
                this.costItemNum_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getGachaPrefabPath() {
                final Object ref = this.gachaPrefabPath_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.gachaPrefabPath_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getGachaPrefabPathBytes() {
                final Object ref = this.gachaPrefabPath_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.gachaPrefabPath_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setGachaPrefabPath(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.gachaPrefabPath_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearGachaPrefabPath() {
                this.gachaPrefabPath_ = GachaInfo.getDefaultInstance().getGachaPrefabPath();
                this.onChanged();
                return this;
            }
            
            public Builder setGachaPrefabPathBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.gachaPrefabPath_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getGachaProbUrl() {
                final Object ref = this.gachaProbUrl_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.gachaProbUrl_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getGachaProbUrlBytes() {
                final Object ref = this.gachaProbUrl_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.gachaProbUrl_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setGachaProbUrl(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.gachaProbUrl_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearGachaProbUrl() {
                this.gachaProbUrl_ = GachaInfo.getDefaultInstance().getGachaProbUrl();
                this.onChanged();
                return this;
            }
            
            public Builder setGachaProbUrlBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.gachaProbUrl_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getGachaRecordUrl() {
                final Object ref = this.gachaRecordUrl_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.gachaRecordUrl_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getGachaRecordUrlBytes() {
                final Object ref = this.gachaRecordUrl_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.gachaRecordUrl_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setGachaRecordUrl(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.gachaRecordUrl_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearGachaRecordUrl() {
                this.gachaRecordUrl_ = GachaInfo.getDefaultInstance().getGachaRecordUrl();
                this.onChanged();
                return this;
            }
            
            public Builder setGachaRecordUrlBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.gachaRecordUrl_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getGachaPreviewPrefabPath() {
                final Object ref = this.gachaPreviewPrefabPath_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.gachaPreviewPrefabPath_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getGachaPreviewPrefabPathBytes() {
                final Object ref = this.gachaPreviewPrefabPath_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.gachaPreviewPrefabPath_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setGachaPreviewPrefabPath(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.gachaPreviewPrefabPath_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearGachaPreviewPrefabPath() {
                this.gachaPreviewPrefabPath_ = GachaInfo.getDefaultInstance().getGachaPreviewPrefabPath();
                this.onChanged();
                return this;
            }
            
            public Builder setGachaPreviewPrefabPathBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.gachaPreviewPrefabPath_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getTenCostItemId() {
                return this.tenCostItemId_;
            }
            
            public Builder setTenCostItemId(final int value) {
                this.tenCostItemId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearTenCostItemId() {
                this.tenCostItemId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getTenCostItemNum() {
                return this.tenCostItemNum_;
            }
            
            public Builder setTenCostItemNum(final int value) {
                this.tenCostItemNum_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearTenCostItemNum() {
                this.tenCostItemNum_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getLeftGachaTimes() {
                return this.leftGachaTimes_;
            }
            
            public Builder setLeftGachaTimes(final int value) {
                this.leftGachaTimes_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearLeftGachaTimes() {
                this.leftGachaTimes_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getGachaTimesLimit() {
                return this.gachaTimesLimit_;
            }
            
            public Builder setGachaTimesLimit(final int value) {
                this.gachaTimesLimit_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearGachaTimesLimit() {
                this.gachaTimesLimit_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getGachaSortId() {
                return this.gachaSortId_;
            }
            
            public Builder setGachaSortId(final int value) {
                this.gachaSortId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearGachaSortId() {
                this.gachaSortId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getGachaProbUrlOversea() {
                final Object ref = this.gachaProbUrlOversea_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.gachaProbUrlOversea_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getGachaProbUrlOverseaBytes() {
                final Object ref = this.gachaProbUrlOversea_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.gachaProbUrlOversea_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setGachaProbUrlOversea(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.gachaProbUrlOversea_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearGachaProbUrlOversea() {
                this.gachaProbUrlOversea_ = GachaInfo.getDefaultInstance().getGachaProbUrlOversea();
                this.onChanged();
                return this;
            }
            
            public Builder setGachaProbUrlOverseaBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.gachaProbUrlOversea_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getGachaRecordUrlOversea() {
                final Object ref = this.gachaRecordUrlOversea_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.gachaRecordUrlOversea_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getGachaRecordUrlOverseaBytes() {
                final Object ref = this.gachaRecordUrlOversea_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.gachaRecordUrlOversea_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setGachaRecordUrlOversea(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.gachaRecordUrlOversea_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearGachaRecordUrlOversea() {
                this.gachaRecordUrlOversea_ = GachaInfo.getDefaultInstance().getGachaRecordUrlOversea();
                this.onChanged();
                return this;
            }
            
            public Builder setGachaRecordUrlOverseaBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.gachaRecordUrlOversea_ = value;
                this.onChanged();
                return this;
            }
            
            private void ensureGachaUpInfoListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.gachaUpInfoList_ = new ArrayList<GachaUpInfoOuterClass.GachaUpInfo>(this.gachaUpInfoList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<GachaUpInfoOuterClass.GachaUpInfo> getGachaUpInfoListList() {
                if (this.gachaUpInfoListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends GachaUpInfoOuterClass.GachaUpInfo>)this.gachaUpInfoList_);
                }
                return this.gachaUpInfoListBuilder_.getMessageList();
            }
            
            @Override
            public int getGachaUpInfoListCount() {
                if (this.gachaUpInfoListBuilder_ == null) {
                    return this.gachaUpInfoList_.size();
                }
                return this.gachaUpInfoListBuilder_.getCount();
            }
            
            @Override
            public GachaUpInfoOuterClass.GachaUpInfo getGachaUpInfoList(final int index) {
                if (this.gachaUpInfoListBuilder_ == null) {
                    return this.gachaUpInfoList_.get(index);
                }
                return this.gachaUpInfoListBuilder_.getMessage(index);
            }
            
            public Builder setGachaUpInfoList(final int index, final GachaUpInfoOuterClass.GachaUpInfo value) {
                if (this.gachaUpInfoListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureGachaUpInfoListIsMutable();
                    this.gachaUpInfoList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.gachaUpInfoListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setGachaUpInfoList(final int index, final GachaUpInfoOuterClass.GachaUpInfo.Builder builderForValue) {
                if (this.gachaUpInfoListBuilder_ == null) {
                    this.ensureGachaUpInfoListIsMutable();
                    this.gachaUpInfoList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.gachaUpInfoListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addGachaUpInfoList(final GachaUpInfoOuterClass.GachaUpInfo value) {
                if (this.gachaUpInfoListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureGachaUpInfoListIsMutable();
                    this.gachaUpInfoList_.add(value);
                    this.onChanged();
                }
                else {
                    this.gachaUpInfoListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addGachaUpInfoList(final int index, final GachaUpInfoOuterClass.GachaUpInfo value) {
                if (this.gachaUpInfoListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureGachaUpInfoListIsMutable();
                    this.gachaUpInfoList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.gachaUpInfoListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addGachaUpInfoList(final GachaUpInfoOuterClass.GachaUpInfo.Builder builderForValue) {
                if (this.gachaUpInfoListBuilder_ == null) {
                    this.ensureGachaUpInfoListIsMutable();
                    this.gachaUpInfoList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.gachaUpInfoListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addGachaUpInfoList(final int index, final GachaUpInfoOuterClass.GachaUpInfo.Builder builderForValue) {
                if (this.gachaUpInfoListBuilder_ == null) {
                    this.ensureGachaUpInfoListIsMutable();
                    this.gachaUpInfoList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.gachaUpInfoListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllGachaUpInfoList(final Iterable<? extends GachaUpInfoOuterClass.GachaUpInfo> values) {
                if (this.gachaUpInfoListBuilder_ == null) {
                    this.ensureGachaUpInfoListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.gachaUpInfoList_);
                    this.onChanged();
                }
                else {
                    this.gachaUpInfoListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearGachaUpInfoList() {
                if (this.gachaUpInfoListBuilder_ == null) {
                    this.gachaUpInfoList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.gachaUpInfoListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeGachaUpInfoList(final int index) {
                if (this.gachaUpInfoListBuilder_ == null) {
                    this.ensureGachaUpInfoListIsMutable();
                    this.gachaUpInfoList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.gachaUpInfoListBuilder_.remove(index);
                }
                return this;
            }
            
            public GachaUpInfoOuterClass.GachaUpInfo.Builder getGachaUpInfoListBuilder(final int index) {
                return this.getGachaUpInfoListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public GachaUpInfoOuterClass.GachaUpInfoOrBuilder getGachaUpInfoListOrBuilder(final int index) {
                if (this.gachaUpInfoListBuilder_ == null) {
                    return this.gachaUpInfoList_.get(index);
                }
                return this.gachaUpInfoListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends GachaUpInfoOuterClass.GachaUpInfoOrBuilder> getGachaUpInfoListOrBuilderList() {
                if (this.gachaUpInfoListBuilder_ != null) {
                    return this.gachaUpInfoListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends GachaUpInfoOuterClass.GachaUpInfoOrBuilder>)this.gachaUpInfoList_);
            }
            
            public GachaUpInfoOuterClass.GachaUpInfo.Builder addGachaUpInfoListBuilder() {
                return this.getGachaUpInfoListFieldBuilder().addBuilder(GachaUpInfoOuterClass.GachaUpInfo.getDefaultInstance());
            }
            
            public GachaUpInfoOuterClass.GachaUpInfo.Builder addGachaUpInfoListBuilder(final int index) {
                return this.getGachaUpInfoListFieldBuilder().addBuilder(index, GachaUpInfoOuterClass.GachaUpInfo.getDefaultInstance());
            }
            
            public List<GachaUpInfoOuterClass.GachaUpInfo.Builder> getGachaUpInfoListBuilderList() {
                return this.getGachaUpInfoListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<GachaUpInfoOuterClass.GachaUpInfo, GachaUpInfoOuterClass.GachaUpInfo.Builder, GachaUpInfoOuterClass.GachaUpInfoOrBuilder> getGachaUpInfoListFieldBuilder() {
                if (this.gachaUpInfoListBuilder_ == null) {
                    this.gachaUpInfoListBuilder_ = new RepeatedFieldBuilderV3<GachaUpInfoOuterClass.GachaUpInfo, GachaUpInfoOuterClass.GachaUpInfo.Builder, GachaUpInfoOuterClass.GachaUpInfoOrBuilder>(this.gachaUpInfoList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.gachaUpInfoList_ = null;
                }
                return this.gachaUpInfoListBuilder_;
            }
            
            @Override
            public String getTitleTextmap() {
                final Object ref = this.titleTextmap_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.titleTextmap_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getTitleTextmapBytes() {
                final Object ref = this.titleTextmap_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.titleTextmap_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setTitleTextmap(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.titleTextmap_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearTitleTextmap() {
                this.titleTextmap_ = GachaInfo.getDefaultInstance().getTitleTextmap();
                this.onChanged();
                return this;
            }
            
            public Builder setTitleTextmapBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.titleTextmap_ = value;
                this.onChanged();
                return this;
            }
            
            private void ensureDisplayUp5ItemListIsMutable() {
                if ((this.bitField0_ & 0x2) == 0x0) {
                    this.displayUp5ItemList_ = GeneratedMessageV3.mutableCopy(this.displayUp5ItemList_);
                    this.bitField0_ |= 0x2;
                }
            }
            
            @Override
            public List<Integer> getDisplayUp5ItemListList() {
                return ((this.bitField0_ & 0x2) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.displayUp5ItemList_) : this.displayUp5ItemList_;
            }
            
            @Override
            public int getDisplayUp5ItemListCount() {
                return this.displayUp5ItemList_.size();
            }
            
            @Override
            public int getDisplayUp5ItemList(final int index) {
                return this.displayUp5ItemList_.getInt(index);
            }
            
            public Builder setDisplayUp5ItemList(final int index, final int value) {
                this.ensureDisplayUp5ItemListIsMutable();
                this.displayUp5ItemList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addDisplayUp5ItemList(final int value) {
                this.ensureDisplayUp5ItemListIsMutable();
                this.displayUp5ItemList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllDisplayUp5ItemList(final Iterable<? extends Integer> values) {
                this.ensureDisplayUp5ItemListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.displayUp5ItemList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearDisplayUp5ItemList() {
                this.displayUp5ItemList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFD;
                this.onChanged();
                return this;
            }
            
            private void ensureDisplayUp4ItemListIsMutable() {
                if ((this.bitField0_ & 0x4) == 0x0) {
                    this.displayUp4ItemList_ = GeneratedMessageV3.mutableCopy(this.displayUp4ItemList_);
                    this.bitField0_ |= 0x4;
                }
            }
            
            @Override
            public List<Integer> getDisplayUp4ItemListList() {
                return ((this.bitField0_ & 0x4) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.displayUp4ItemList_) : this.displayUp4ItemList_;
            }
            
            @Override
            public int getDisplayUp4ItemListCount() {
                return this.displayUp4ItemList_.size();
            }
            
            @Override
            public int getDisplayUp4ItemList(final int index) {
                return this.displayUp4ItemList_.getInt(index);
            }
            
            public Builder setDisplayUp4ItemList(final int index, final int value) {
                this.ensureDisplayUp4ItemListIsMutable();
                this.displayUp4ItemList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addDisplayUp4ItemList(final int value) {
                this.ensureDisplayUp4ItemListIsMutable();
                this.displayUp4ItemList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllDisplayUp4ItemList(final Iterable<? extends Integer> values) {
                this.ensureDisplayUp4ItemListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.displayUp4ItemList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearDisplayUp4ItemList() {
                this.displayUp4ItemList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFB;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getWishItemId() {
                return this.wishItemId_;
            }
            
            public Builder setWishItemId(final int value) {
                this.wishItemId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearWishItemId() {
                this.wishItemId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getWishProgress() {
                return this.wishProgress_;
            }
            
            public Builder setWishProgress(final int value) {
                this.wishProgress_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearWishProgress() {
                this.wishProgress_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getWishMaxProgress() {
                return this.wishMaxProgress_;
            }
            
            public Builder setWishMaxProgress(final int value) {
                this.wishMaxProgress_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearWishMaxProgress() {
                this.wishMaxProgress_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getIsNewWish() {
                return this.isNewWish_;
            }
            
            public Builder setIsNewWish(final boolean value) {
                this.isNewWish_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsNewWish() {
                this.isNewWish_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface GachaInfoOrBuilder extends MessageOrBuilder
    {
        int getGachaType();
        
        int getScheduleId();
        
        int getBeginTime();
        
        int getEndTime();
        
        int getCostItemId();
        
        int getCostItemNum();
        
        String getGachaPrefabPath();
        
        ByteString getGachaPrefabPathBytes();
        
        String getGachaProbUrl();
        
        ByteString getGachaProbUrlBytes();
        
        String getGachaRecordUrl();
        
        ByteString getGachaRecordUrlBytes();
        
        String getGachaPreviewPrefabPath();
        
        ByteString getGachaPreviewPrefabPathBytes();
        
        int getTenCostItemId();
        
        int getTenCostItemNum();
        
        int getLeftGachaTimes();
        
        int getGachaTimesLimit();
        
        int getGachaSortId();
        
        String getGachaProbUrlOversea();
        
        ByteString getGachaProbUrlOverseaBytes();
        
        String getGachaRecordUrlOversea();
        
        ByteString getGachaRecordUrlOverseaBytes();
        
        List<GachaUpInfoOuterClass.GachaUpInfo> getGachaUpInfoListList();
        
        GachaUpInfoOuterClass.GachaUpInfo getGachaUpInfoList(final int p0);
        
        int getGachaUpInfoListCount();
        
        List<? extends GachaUpInfoOuterClass.GachaUpInfoOrBuilder> getGachaUpInfoListOrBuilderList();
        
        GachaUpInfoOuterClass.GachaUpInfoOrBuilder getGachaUpInfoListOrBuilder(final int p0);
        
        String getTitleTextmap();
        
        ByteString getTitleTextmapBytes();
        
        List<Integer> getDisplayUp5ItemListList();
        
        int getDisplayUp5ItemListCount();
        
        int getDisplayUp5ItemList(final int p0);
        
        List<Integer> getDisplayUp4ItemListList();
        
        int getDisplayUp4ItemListCount();
        
        int getDisplayUp4ItemList(final int p0);
        
        int getWishItemId();
        
        int getWishProgress();
        
        int getWishMaxProgress();
        
        boolean getIsNewWish();
    }
}
