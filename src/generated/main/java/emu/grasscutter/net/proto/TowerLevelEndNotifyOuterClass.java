// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
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

public final class TowerLevelEndNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_TowerLevelEndNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_TowerLevelEndNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private TowerLevelEndNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return TowerLevelEndNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0019TowerLevelEndNotify.proto\u001a\u000fItemParam.proto\"»\u0002\n\u0013TowerLevelEndNotify\u0012\u0015\n\rnext_floor_id\u0018\u0004 \u0001(\r\u0012$\n\u0010reward_item_list\u0018\f \u0003(\u000b2\n.ItemParam\u0012\u0016\n\u000econtinue_state\u0018\u000f \u0001(\r\u0012\u0012\n\nis_success\u0018\u0005 \u0001(\b\u0012\u001f\n\u0017finished_star_cond_list\u0018\u0006 \u0003(\r\"\u0099\u0001\n\u0011ContinueStateType\u0012(\n$CONTINUE_STATE_TYPE_CAN_NOT_CONTINUE\u0010\u0000\u0012,\n(CONTINUE_STATE_TYPE_CAN_ENTER_NEXT_LEVEL\u0010\u0001\u0012,\n(CONTINUE_STATE_TYPE_CAN_ENTER_NEXT_FLOOR\u0010\u0002B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        TowerLevelEndNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { ItemParamOuterClass.getDescriptor() });
        internal_static_TowerLevelEndNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_TowerLevelEndNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(TowerLevelEndNotifyOuterClass.internal_static_TowerLevelEndNotify_descriptor, new String[] { "NextFloorId", "RewardItemList", "ContinueState", "IsSuccess", "FinishedStarCondList" });
        ItemParamOuterClass.getDescriptor();
    }
    
    public static final class TowerLevelEndNotify extends GeneratedMessageV3 implements TowerLevelEndNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int NEXT_FLOOR_ID_FIELD_NUMBER = 4;
        private int nextFloorId_;
        public static final int REWARD_ITEM_LIST_FIELD_NUMBER = 12;
        private List<ItemParamOuterClass.ItemParam> rewardItemList_;
        public static final int CONTINUE_STATE_FIELD_NUMBER = 15;
        private int continueState_;
        public static final int IS_SUCCESS_FIELD_NUMBER = 5;
        private boolean isSuccess_;
        public static final int FINISHED_STAR_COND_LIST_FIELD_NUMBER = 6;
        private Internal.IntList finishedStarCondList_;
        private int finishedStarCondListMemoizedSerializedSize;
        private byte memoizedIsInitialized;
        private static final TowerLevelEndNotify DEFAULT_INSTANCE;
        private static final Parser<TowerLevelEndNotify> PARSER;
        
        private TowerLevelEndNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.finishedStarCondListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private TowerLevelEndNotify() {
            this.finishedStarCondListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.rewardItemList_ = Collections.emptyList();
            this.finishedStarCondList_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new TowerLevelEndNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private TowerLevelEndNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 32: {
                            this.nextFloorId_ = input.readUInt32();
                            continue;
                        }
                        case 40: {
                            this.isSuccess_ = input.readBool();
                            continue;
                        }
                        case 48: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.finishedStarCondList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x2;
                            }
                            this.finishedStarCondList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 50: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x2) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.finishedStarCondList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x2;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.finishedStarCondList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 98: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.rewardItemList_ = new ArrayList<ItemParamOuterClass.ItemParam>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.rewardItemList_.add(input.readMessage(ItemParamOuterClass.ItemParam.parser(), extensionRegistry));
                            continue;
                        }
                        case 120: {
                            this.continueState_ = input.readUInt32();
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
                if ((mutable_bitField0_ & 0x2) != 0x0) {
                    this.finishedStarCondList_.makeImmutable();
                }
                if ((mutable_bitField0_ & 0x1) != 0x0) {
                    this.rewardItemList_ = Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParam>)this.rewardItemList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return TowerLevelEndNotifyOuterClass.internal_static_TowerLevelEndNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return TowerLevelEndNotifyOuterClass.internal_static_TowerLevelEndNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(TowerLevelEndNotify.class, Builder.class);
        }
        
        @Override
        public int getNextFloorId() {
            return this.nextFloorId_;
        }
        
        @Override
        public List<ItemParamOuterClass.ItemParam> getRewardItemListList() {
            return this.rewardItemList_;
        }
        
        @Override
        public List<? extends ItemParamOuterClass.ItemParamOrBuilder> getRewardItemListOrBuilderList() {
            return this.rewardItemList_;
        }
        
        @Override
        public int getRewardItemListCount() {
            return this.rewardItemList_.size();
        }
        
        @Override
        public ItemParamOuterClass.ItemParam getRewardItemList(final int index) {
            return this.rewardItemList_.get(index);
        }
        
        @Override
        public ItemParamOuterClass.ItemParamOrBuilder getRewardItemListOrBuilder(final int index) {
            return this.rewardItemList_.get(index);
        }
        
        @Override
        public int getContinueState() {
            return this.continueState_;
        }
        
        @Override
        public boolean getIsSuccess() {
            return this.isSuccess_;
        }
        
        @Override
        public List<Integer> getFinishedStarCondListList() {
            return this.finishedStarCondList_;
        }
        
        @Override
        public int getFinishedStarCondListCount() {
            return this.finishedStarCondList_.size();
        }
        
        @Override
        public int getFinishedStarCondList(final int index) {
            return this.finishedStarCondList_.getInt(index);
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
            if (this.nextFloorId_ != 0) {
                output.writeUInt32(4, this.nextFloorId_);
            }
            if (this.isSuccess_) {
                output.writeBool(5, this.isSuccess_);
            }
            if (this.getFinishedStarCondListList().size() > 0) {
                output.writeUInt32NoTag(50);
                output.writeUInt32NoTag(this.finishedStarCondListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.finishedStarCondList_.size(); ++i) {
                output.writeUInt32NoTag(this.finishedStarCondList_.getInt(i));
            }
            for (int i = 0; i < this.rewardItemList_.size(); ++i) {
                output.writeMessage(12, this.rewardItemList_.get(i));
            }
            if (this.continueState_ != 0) {
                output.writeUInt32(15, this.continueState_);
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
            if (this.nextFloorId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(4, this.nextFloorId_);
            }
            if (this.isSuccess_) {
                size += CodedOutputStream.computeBoolSize(5, this.isSuccess_);
            }
            int dataSize = 0;
            for (int i = 0; i < this.finishedStarCondList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.finishedStarCondList_.getInt(i));
            }
            size += dataSize;
            if (!this.getFinishedStarCondListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.finishedStarCondListMemoizedSerializedSize = dataSize;
            for (int j = 0; j < this.rewardItemList_.size(); ++j) {
                size += CodedOutputStream.computeMessageSize(12, this.rewardItemList_.get(j));
            }
            if (this.continueState_ != 0) {
                size += CodedOutputStream.computeUInt32Size(15, this.continueState_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TowerLevelEndNotify)) {
                return super.equals(obj);
            }
            final TowerLevelEndNotify other = (TowerLevelEndNotify)obj;
            return this.getNextFloorId() == other.getNextFloorId() && this.getRewardItemListList().equals(other.getRewardItemListList()) && this.getContinueState() == other.getContinueState() && this.getIsSuccess() == other.getIsSuccess() && this.getFinishedStarCondListList().equals(other.getFinishedStarCondListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getNextFloorId();
            if (this.getRewardItemListCount() > 0) {
                hash = 37 * hash + 12;
                hash = 53 * hash + this.getRewardItemListList().hashCode();
            }
            hash = 37 * hash + 15;
            hash = 53 * hash + this.getContinueState();
            hash = 37 * hash + 5;
            hash = 53 * hash + Internal.hashBoolean(this.getIsSuccess());
            if (this.getFinishedStarCondListCount() > 0) {
                hash = 37 * hash + 6;
                hash = 53 * hash + this.getFinishedStarCondListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static TowerLevelEndNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return TowerLevelEndNotify.PARSER.parseFrom(data);
        }
        
        public static TowerLevelEndNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TowerLevelEndNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TowerLevelEndNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return TowerLevelEndNotify.PARSER.parseFrom(data);
        }
        
        public static TowerLevelEndNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TowerLevelEndNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TowerLevelEndNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return TowerLevelEndNotify.PARSER.parseFrom(data);
        }
        
        public static TowerLevelEndNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TowerLevelEndNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TowerLevelEndNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TowerLevelEndNotify.PARSER, input);
        }
        
        public static TowerLevelEndNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TowerLevelEndNotify.PARSER, input, extensionRegistry);
        }
        
        public static TowerLevelEndNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(TowerLevelEndNotify.PARSER, input);
        }
        
        public static TowerLevelEndNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(TowerLevelEndNotify.PARSER, input, extensionRegistry);
        }
        
        public static TowerLevelEndNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TowerLevelEndNotify.PARSER, input);
        }
        
        public static TowerLevelEndNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TowerLevelEndNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return TowerLevelEndNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final TowerLevelEndNotify prototype) {
            return TowerLevelEndNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == TowerLevelEndNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static TowerLevelEndNotify getDefaultInstance() {
            return TowerLevelEndNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<TowerLevelEndNotify> parser() {
            return TowerLevelEndNotify.PARSER;
        }
        
        @Override
        public Parser<TowerLevelEndNotify> getParserForType() {
            return TowerLevelEndNotify.PARSER;
        }
        
        @Override
        public TowerLevelEndNotify getDefaultInstanceForType() {
            return TowerLevelEndNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new TowerLevelEndNotify();
            PARSER = new AbstractParser<TowerLevelEndNotify>() {
                @Override
                public TowerLevelEndNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new TowerLevelEndNotify(input, extensionRegistry);
                }
            };
        }
        
        public enum ContinueStateType implements ProtocolMessageEnum
        {
            CONTINUE_STATE_TYPE_CAN_NOT_CONTINUE(0), 
            CONTINUE_STATE_TYPE_CAN_ENTER_NEXT_LEVEL(1), 
            CONTINUE_STATE_TYPE_CAN_ENTER_NEXT_FLOOR(2), 
            UNRECOGNIZED(-1);
            
            public static final int CONTINUE_STATE_TYPE_CAN_NOT_CONTINUE_VALUE = 0;
            public static final int CONTINUE_STATE_TYPE_CAN_ENTER_NEXT_LEVEL_VALUE = 1;
            public static final int CONTINUE_STATE_TYPE_CAN_ENTER_NEXT_FLOOR_VALUE = 2;
            private static final Internal.EnumLiteMap<ContinueStateType> internalValueMap;
            private static final ContinueStateType[] VALUES;
            private final int value;
            
            @Override
            public final int getNumber() {
                if (this == ContinueStateType.UNRECOGNIZED) {
                    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                }
                return this.value;
            }
            
            @Deprecated
            public static ContinueStateType valueOf(final int value) {
                return forNumber(value);
            }
            
            public static ContinueStateType forNumber(final int value) {
                switch (value) {
                    case 0: {
                        return ContinueStateType.CONTINUE_STATE_TYPE_CAN_NOT_CONTINUE;
                    }
                    case 1: {
                        return ContinueStateType.CONTINUE_STATE_TYPE_CAN_ENTER_NEXT_LEVEL;
                    }
                    case 2: {
                        return ContinueStateType.CONTINUE_STATE_TYPE_CAN_ENTER_NEXT_FLOOR;
                    }
                    default: {
                        return null;
                    }
                }
            }
            
            public static Internal.EnumLiteMap<ContinueStateType> internalGetValueMap() {
                return ContinueStateType.internalValueMap;
            }
            
            @Override
            public final Descriptors.EnumValueDescriptor getValueDescriptor() {
                if (this == ContinueStateType.UNRECOGNIZED) {
                    throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
                }
                return getDescriptor().getValues().get(this.ordinal());
            }
            
            @Override
            public final Descriptors.EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }
            
            public static final Descriptors.EnumDescriptor getDescriptor() {
                return TowerLevelEndNotify.getDescriptor().getEnumTypes().get(0);
            }
            
            public static ContinueStateType valueOf(final Descriptors.EnumValueDescriptor desc) {
                if (desc.getType() != getDescriptor()) {
                    throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
                }
                if (desc.getIndex() == -1) {
                    return ContinueStateType.UNRECOGNIZED;
                }
                return ContinueStateType.VALUES[desc.getIndex()];
            }
            
            private ContinueStateType(final int value) {
                this.value = value;
            }
            
            private static /* synthetic */ ContinueStateType[] value() {
                return new ContinueStateType[] { ContinueStateType.CONTINUE_STATE_TYPE_CAN_NOT_CONTINUE, ContinueStateType.CONTINUE_STATE_TYPE_CAN_ENTER_NEXT_LEVEL, ContinueStateType.CONTINUE_STATE_TYPE_CAN_ENTER_NEXT_FLOOR, ContinueStateType.UNRECOGNIZED };
            }
            
            static {
                VALUES = values();
                internalValueMap = new Internal.EnumLiteMap<ContinueStateType>() {
                    @Override
                    public ContinueStateType findValueByNumber(final int number) {
                        return ContinueStateType.forNumber(number);
                    }
                };

        }
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TowerLevelEndNotifyOrBuilder
        {
            private int bitField0_;
            private int nextFloorId_;
            private List<ItemParamOuterClass.ItemParam> rewardItemList_;
            private RepeatedFieldBuilderV3<ItemParamOuterClass.ItemParam, ItemParamOuterClass.ItemParam.Builder, ItemParamOuterClass.ItemParamOrBuilder> rewardItemListBuilder_;
            private int continueState_;
            private boolean isSuccess_;
            private Internal.IntList finishedStarCondList_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return TowerLevelEndNotifyOuterClass.internal_static_TowerLevelEndNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return TowerLevelEndNotifyOuterClass.internal_static_TowerLevelEndNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(TowerLevelEndNotify.class, Builder.class);
            }
            
            private Builder() {
                this.rewardItemList_ = Collections.emptyList();
                this.finishedStarCondList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.rewardItemList_ = Collections.emptyList();
                this.finishedStarCondList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (TowerLevelEndNotify.alwaysUseFieldBuilders) {
                    this.getRewardItemListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.nextFloorId_ = 0;
                if (this.rewardItemListBuilder_ == null) {
                    this.rewardItemList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.rewardItemListBuilder_.clear();
                }
                this.continueState_ = 0;
                this.isSuccess_ = false;
                this.finishedStarCondList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFD;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return TowerLevelEndNotifyOuterClass.internal_static_TowerLevelEndNotify_descriptor;
            }
            
            @Override
            public TowerLevelEndNotify getDefaultInstanceForType() {
                return TowerLevelEndNotify.getDefaultInstance();
            }
            
            @Override
            public TowerLevelEndNotify build() {
                final TowerLevelEndNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public TowerLevelEndNotify buildPartial() {
                final TowerLevelEndNotify result = new TowerLevelEndNotify(this);
                final int from_bitField0_ = this.bitField0_;
                result.nextFloorId_ = this.nextFloorId_;
                if (this.rewardItemListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.rewardItemList_ = Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParam>)this.rewardItemList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.rewardItemList_ = this.rewardItemList_;
                }
                else {
                    result.rewardItemList_ = this.rewardItemListBuilder_.build();
                }
                result.continueState_ = this.continueState_;
                result.isSuccess_ = this.isSuccess_;
                if ((this.bitField0_ & 0x2) != 0x0) {
                    this.finishedStarCondList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFD;
                }
                result.finishedStarCondList_ = this.finishedStarCondList_;
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
                if (other instanceof TowerLevelEndNotify) {
                    return this.mergeFrom((TowerLevelEndNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final TowerLevelEndNotify other) {
                if (other == TowerLevelEndNotify.getDefaultInstance()) {
                    return this;
                }
                if (other.getNextFloorId() != 0) {
                    this.setNextFloorId(other.getNextFloorId());
                }
                if (this.rewardItemListBuilder_ == null) {
                    if (!other.rewardItemList_.isEmpty()) {
                        if (this.rewardItemList_.isEmpty()) {
                            this.rewardItemList_ = other.rewardItemList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureRewardItemListIsMutable();
                            this.rewardItemList_.addAll(other.rewardItemList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.rewardItemList_.isEmpty()) {
                    if (this.rewardItemListBuilder_.isEmpty()) {
                        this.rewardItemListBuilder_.dispose();
                        this.rewardItemListBuilder_ = null;
                        this.rewardItemList_ = other.rewardItemList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.rewardItemListBuilder_ = (TowerLevelEndNotify.alwaysUseFieldBuilders ? this.getRewardItemListFieldBuilder() : null);
                    }
                    else {
                        this.rewardItemListBuilder_.addAllMessages(other.rewardItemList_);
                    }
                }
                if (other.getContinueState() != 0) {
                    this.setContinueState(other.getContinueState());
                }
                if (other.getIsSuccess()) {
                    this.setIsSuccess(other.getIsSuccess());
                }
                if (!other.finishedStarCondList_.isEmpty()) {
                    if (this.finishedStarCondList_.isEmpty()) {
                        this.finishedStarCondList_ = other.finishedStarCondList_;
                        this.bitField0_ &= 0xFFFFFFFD;
                    }
                    else {
                        this.ensureFinishedStarCondListIsMutable();
                        this.finishedStarCondList_.addAll(other.finishedStarCondList_);
                    }
                    this.onChanged();
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
                TowerLevelEndNotify parsedMessage = null;
                try {
                    parsedMessage = TowerLevelEndNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (TowerLevelEndNotify)e.getUnfinishedMessage();
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
            public int getNextFloorId() {
                return this.nextFloorId_;
            }
            
            public Builder setNextFloorId(final int value) {
                this.nextFloorId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearNextFloorId() {
                this.nextFloorId_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensureRewardItemListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.rewardItemList_ = new ArrayList<ItemParamOuterClass.ItemParam>(this.rewardItemList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<ItemParamOuterClass.ItemParam> getRewardItemListList() {
                if (this.rewardItemListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParam>)this.rewardItemList_);
                }
                return this.rewardItemListBuilder_.getMessageList();
            }
            
            @Override
            public int getRewardItemListCount() {
                if (this.rewardItemListBuilder_ == null) {
                    return this.rewardItemList_.size();
                }
                return this.rewardItemListBuilder_.getCount();
            }
            
            @Override
            public ItemParamOuterClass.ItemParam getRewardItemList(final int index) {
                if (this.rewardItemListBuilder_ == null) {
                    return this.rewardItemList_.get(index);
                }
                return this.rewardItemListBuilder_.getMessage(index);
            }
            
            public Builder setRewardItemList(final int index, final ItemParamOuterClass.ItemParam value) {
                if (this.rewardItemListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureRewardItemListIsMutable();
                    this.rewardItemList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.rewardItemListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setRewardItemList(final int index, final ItemParamOuterClass.ItemParam.Builder builderForValue) {
                if (this.rewardItemListBuilder_ == null) {
                    this.ensureRewardItemListIsMutable();
                    this.rewardItemList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.rewardItemListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addRewardItemList(final ItemParamOuterClass.ItemParam value) {
                if (this.rewardItemListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureRewardItemListIsMutable();
                    this.rewardItemList_.add(value);
                    this.onChanged();
                }
                else {
                    this.rewardItemListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addRewardItemList(final int index, final ItemParamOuterClass.ItemParam value) {
                if (this.rewardItemListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureRewardItemListIsMutable();
                    this.rewardItemList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.rewardItemListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addRewardItemList(final ItemParamOuterClass.ItemParam.Builder builderForValue) {
                if (this.rewardItemListBuilder_ == null) {
                    this.ensureRewardItemListIsMutable();
                    this.rewardItemList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.rewardItemListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addRewardItemList(final int index, final ItemParamOuterClass.ItemParam.Builder builderForValue) {
                if (this.rewardItemListBuilder_ == null) {
                    this.ensureRewardItemListIsMutable();
                    this.rewardItemList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.rewardItemListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllRewardItemList(final Iterable<? extends ItemParamOuterClass.ItemParam> values) {
                if (this.rewardItemListBuilder_ == null) {
                    this.ensureRewardItemListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.rewardItemList_);
                    this.onChanged();
                }
                else {
                    this.rewardItemListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearRewardItemList() {
                if (this.rewardItemListBuilder_ == null) {
                    this.rewardItemList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.rewardItemListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeRewardItemList(final int index) {
                if (this.rewardItemListBuilder_ == null) {
                    this.ensureRewardItemListIsMutable();
                    this.rewardItemList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.rewardItemListBuilder_.remove(index);
                }
                return this;
            }
            
            public ItemParamOuterClass.ItemParam.Builder getRewardItemListBuilder(final int index) {
                return this.getRewardItemListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public ItemParamOuterClass.ItemParamOrBuilder getRewardItemListOrBuilder(final int index) {
                if (this.rewardItemListBuilder_ == null) {
                    return this.rewardItemList_.get(index);
                }
                return this.rewardItemListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends ItemParamOuterClass.ItemParamOrBuilder> getRewardItemListOrBuilderList() {
                if (this.rewardItemListBuilder_ != null) {
                    return this.rewardItemListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParamOrBuilder>)this.rewardItemList_);
            }
            
            public ItemParamOuterClass.ItemParam.Builder addRewardItemListBuilder() {
                return this.getRewardItemListFieldBuilder().addBuilder(ItemParamOuterClass.ItemParam.getDefaultInstance());
            }
            
            public ItemParamOuterClass.ItemParam.Builder addRewardItemListBuilder(final int index) {
                return this.getRewardItemListFieldBuilder().addBuilder(index, ItemParamOuterClass.ItemParam.getDefaultInstance());
            }
            
            public List<ItemParamOuterClass.ItemParam.Builder> getRewardItemListBuilderList() {
                return this.getRewardItemListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<ItemParamOuterClass.ItemParam, ItemParamOuterClass.ItemParam.Builder, ItemParamOuterClass.ItemParamOrBuilder> getRewardItemListFieldBuilder() {
                if (this.rewardItemListBuilder_ == null) {
                    this.rewardItemListBuilder_ = new RepeatedFieldBuilderV3<ItemParamOuterClass.ItemParam, ItemParamOuterClass.ItemParam.Builder, ItemParamOuterClass.ItemParamOrBuilder>(this.rewardItemList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.rewardItemList_ = null;
                }
                return this.rewardItemListBuilder_;
            }
            
            @Override
            public int getContinueState() {
                return this.continueState_;
            }
            
            public Builder setContinueState(final int value) {
                this.continueState_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearContinueState() {
                this.continueState_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getIsSuccess() {
                return this.isSuccess_;
            }
            
            public Builder setIsSuccess(final boolean value) {
                this.isSuccess_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsSuccess() {
                this.isSuccess_ = false;
                this.onChanged();
                return this;
            }
            
            private void ensureFinishedStarCondListIsMutable() {
                if ((this.bitField0_ & 0x2) == 0x0) {
                    this.finishedStarCondList_ = GeneratedMessageV3.mutableCopy(this.finishedStarCondList_);
                    this.bitField0_ |= 0x2;
                }
            }
            
            @Override
            public List<Integer> getFinishedStarCondListList() {
                return ((this.bitField0_ & 0x2) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.finishedStarCondList_) : this.finishedStarCondList_;
            }
            
            @Override
            public int getFinishedStarCondListCount() {
                return this.finishedStarCondList_.size();
            }
            
            @Override
            public int getFinishedStarCondList(final int index) {
                return this.finishedStarCondList_.getInt(index);
            }
            
            public Builder setFinishedStarCondList(final int index, final int value) {
                this.ensureFinishedStarCondListIsMutable();
                this.finishedStarCondList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addFinishedStarCondList(final int value) {
                this.ensureFinishedStarCondListIsMutable();
                this.finishedStarCondList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllFinishedStarCondList(final Iterable<? extends Integer> values) {
                this.ensureFinishedStarCondListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.finishedStarCondList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearFinishedStarCondList() {
                this.finishedStarCondList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFD;
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
    
    public interface TowerLevelEndNotifyOrBuilder extends MessageOrBuilder
    {
        int getNextFloorId();
        
        List<ItemParamOuterClass.ItemParam> getRewardItemListList();
        
        ItemParamOuterClass.ItemParam getRewardItemList(final int p0);
        
        int getRewardItemListCount();
        
        List<? extends ItemParamOuterClass.ItemParamOrBuilder> getRewardItemListOrBuilderList();
        
        ItemParamOuterClass.ItemParamOrBuilder getRewardItemListOrBuilder(final int p0);
        
        int getContinueState();
        
        boolean getIsSuccess();
        
        List<Integer> getFinishedStarCondListList();
        
        int getFinishedStarCondListCount();
        
        int getFinishedStarCondList(final int p0);
    }
}
