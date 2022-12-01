// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.WireFormat;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import java.util.Iterator;
import com.google.protobuf.CodedOutputStream;
import java.util.Map;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MapEntry;
import java.util.ArrayList;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import java.util.Collections;
import com.google.protobuf.Parser;
import com.google.protobuf.MapField;
import java.util.List;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class AvatarExpeditionGetRewardRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_AvatarExpeditionGetRewardRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AvatarExpeditionGetRewardRsp_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_AvatarExpeditionGetRewardRsp_ExpeditionInfoMapEntry_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AvatarExpeditionGetRewardRsp_ExpeditionInfoMapEntry_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private AvatarExpeditionGetRewardRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return AvatarExpeditionGetRewardRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\"AvatarExpeditionGetRewardRsp.proto\u001a\u001aAvatarExpeditionInfo.proto\u001a\u000fItemParam.proto\"\u009b\u0002\n\u001cAvatarExpeditionGetRewardRsp\u0012'\n\u0013Unk2700_HBKHOBPGCLH\u0018\t \u0003(\u000b2\n.ItemParam\u0012\u001d\n\titem_list\u0018\b \u0003(\u000b2\n.ItemParam\u0012Q\n\u0013expedition_info_map\u0018\f \u0003(\u000b24.AvatarExpeditionGetRewardRsp.ExpeditionInfoMapEntry\u0012\u000f\n\u0007retcode\u0018\u0002 \u0001(\u0005\u001aO\n\u0016ExpeditionInfoMapEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\u0004\u0012$\n\u0005value\u0018\u0002 \u0001(\u000b2\u0015.AvatarExpeditionInfo:\u00028\u0001B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        AvatarExpeditionGetRewardRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { AvatarExpeditionInfoOuterClass.getDescriptor(), ItemParamOuterClass.getDescriptor() });
        internal_static_AvatarExpeditionGetRewardRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_AvatarExpeditionGetRewardRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(AvatarExpeditionGetRewardRspOuterClass.internal_static_AvatarExpeditionGetRewardRsp_descriptor, new String[] { "Unk2700HBKHOBPGCLH", "ItemList", "ExpeditionInfoMap", "Retcode" });
        internal_static_AvatarExpeditionGetRewardRsp_ExpeditionInfoMapEntry_descriptor = AvatarExpeditionGetRewardRspOuterClass.internal_static_AvatarExpeditionGetRewardRsp_descriptor.getNestedTypes().get(0);
        internal_static_AvatarExpeditionGetRewardRsp_ExpeditionInfoMapEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(AvatarExpeditionGetRewardRspOuterClass.internal_static_AvatarExpeditionGetRewardRsp_ExpeditionInfoMapEntry_descriptor, new String[] { "Key", "Value" });
        AvatarExpeditionInfoOuterClass.getDescriptor();
        ItemParamOuterClass.getDescriptor();
    }
    
    public static final class AvatarExpeditionGetRewardRsp extends GeneratedMessageV3 implements AvatarExpeditionGetRewardRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int UNK2700_HBKHOBPGCLH_FIELD_NUMBER = 9;
        private List<ItemParamOuterClass.ItemParam> unk2700HBKHOBPGCLH_;
        public static final int ITEM_LIST_FIELD_NUMBER = 8;
        private List<ItemParamOuterClass.ItemParam> itemList_;
        public static final int EXPEDITION_INFO_MAP_FIELD_NUMBER = 12;
        private MapField<Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> expeditionInfoMap_;
        public static final int RETCODE_FIELD_NUMBER = 2;
        private int retcode_;
        private byte memoizedIsInitialized;
        private static final AvatarExpeditionGetRewardRsp DEFAULT_INSTANCE;
        private static final Parser<AvatarExpeditionGetRewardRsp> PARSER;
        
        private AvatarExpeditionGetRewardRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private AvatarExpeditionGetRewardRsp() {
            this.memoizedIsInitialized = -1;
            this.unk2700HBKHOBPGCLH_ = Collections.emptyList();
            this.itemList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new AvatarExpeditionGetRewardRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private AvatarExpeditionGetRewardRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 16: {
                            this.retcode_ = input.readInt32();
                            continue;
                        }
                        case 66: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.itemList_ = new ArrayList<ItemParamOuterClass.ItemParam>();
                                mutable_bitField0_ |= 0x2;
                            }
                            this.itemList_.add(input.readMessage(ItemParamOuterClass.ItemParam.parser(), extensionRegistry));
                            continue;
                        }
                        case 74: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.unk2700HBKHOBPGCLH_ = new ArrayList<ItemParamOuterClass.ItemParam>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.unk2700HBKHOBPGCLH_.add(input.readMessage(ItemParamOuterClass.ItemParam.parser(), extensionRegistry));
                            continue;
                        }
                        case 98: {
                            if ((mutable_bitField0_ & 0x4) == 0x0) {
                                this.expeditionInfoMap_ = MapField.newMapField(ExpeditionInfoMapDefaultEntryHolder.defaultEntry);
                                mutable_bitField0_ |= 0x4;
                            }
                            final MapEntry<Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> expeditionInfoMap__ = input.readMessage(ExpeditionInfoMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                            this.expeditionInfoMap_.getMutableMap().put(expeditionInfoMap__.getKey(), expeditionInfoMap__.getValue());
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
                    this.itemList_ = Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParam>)this.itemList_);
                }
                if ((mutable_bitField0_ & 0x1) != 0x0) {
                    this.unk2700HBKHOBPGCLH_ = Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParam>)this.unk2700HBKHOBPGCLH_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return AvatarExpeditionGetRewardRspOuterClass.internal_static_AvatarExpeditionGetRewardRsp_descriptor;
        }
        
        @Override
        protected MapField internalGetMapField(final int number) {
            switch (number) {
                case 12: {
                    return this.internalGetExpeditionInfoMap();
                }
                default: {
                    throw new RuntimeException("Invalid map field number: " + number);
                }
            }
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return AvatarExpeditionGetRewardRspOuterClass.internal_static_AvatarExpeditionGetRewardRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(AvatarExpeditionGetRewardRsp.class, Builder.class);
        }
        
        @Override
        public List<ItemParamOuterClass.ItemParam> getUnk2700HBKHOBPGCLHList() {
            return this.unk2700HBKHOBPGCLH_;
        }
        
        @Override
        public List<? extends ItemParamOuterClass.ItemParamOrBuilder> getUnk2700HBKHOBPGCLHOrBuilderList() {
            return this.unk2700HBKHOBPGCLH_;
        }
        
        @Override
        public int getUnk2700HBKHOBPGCLHCount() {
            return this.unk2700HBKHOBPGCLH_.size();
        }
        
        @Override
        public ItemParamOuterClass.ItemParam getUnk2700HBKHOBPGCLH(final int index) {
            return this.unk2700HBKHOBPGCLH_.get(index);
        }
        
        @Override
        public ItemParamOuterClass.ItemParamOrBuilder getUnk2700HBKHOBPGCLHOrBuilder(final int index) {
            return this.unk2700HBKHOBPGCLH_.get(index);
        }
        
        @Override
        public List<ItemParamOuterClass.ItemParam> getItemListList() {
            return this.itemList_;
        }
        
        @Override
        public List<? extends ItemParamOuterClass.ItemParamOrBuilder> getItemListOrBuilderList() {
            return this.itemList_;
        }
        
        @Override
        public int getItemListCount() {
            return this.itemList_.size();
        }
        
        @Override
        public ItemParamOuterClass.ItemParam getItemList(final int index) {
            return this.itemList_.get(index);
        }
        
        @Override
        public ItemParamOuterClass.ItemParamOrBuilder getItemListOrBuilder(final int index) {
            return this.itemList_.get(index);
        }
        
        private MapField<Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> internalGetExpeditionInfoMap() {
            if (this.expeditionInfoMap_ == null) {
                return MapField.emptyMapField(ExpeditionInfoMapDefaultEntryHolder.defaultEntry);
            }
            return this.expeditionInfoMap_;
        }
        
        @Override
        public int getExpeditionInfoMapCount() {
            return this.internalGetExpeditionInfoMap().getMap().size();
        }
        
        @Override
        public boolean containsExpeditionInfoMap(final long key) {
            return this.internalGetExpeditionInfoMap().getMap().containsKey(key);
        }
        
        @Deprecated
        @Override
        public Map<Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> getExpeditionInfoMap() {
            return this.getExpeditionInfoMapMap();
        }
        
        @Override
        public Map<Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> getExpeditionInfoMapMap() {
            return this.internalGetExpeditionInfoMap().getMap();
        }
        
        @Override
        public AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo getExpeditionInfoMapOrDefault(final long key, final AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo defaultValue) {
            final Map<Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> map = this.internalGetExpeditionInfoMap().getMap();
            return map.containsKey(key) ? map.get(key) : defaultValue;
        }
        
        @Override
        public AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo getExpeditionInfoMapOrThrow(final long key) {
            final Map<Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> map = this.internalGetExpeditionInfoMap().getMap();
            if (!map.containsKey(key)) {
                throw new IllegalArgumentException();
            }
            return map.get(key);
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
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
            if (this.retcode_ != 0) {
                output.writeInt32(2, this.retcode_);
            }
            for (int i = 0; i < this.itemList_.size(); ++i) {
                output.writeMessage(8, this.itemList_.get(i));
            }
            for (int i = 0; i < this.unk2700HBKHOBPGCLH_.size(); ++i) {
                output.writeMessage(9, this.unk2700HBKHOBPGCLH_.get(i));
            }
            GeneratedMessageV3.serializeLongMapTo(output, this.internalGetExpeditionInfoMap(), ExpeditionInfoMapDefaultEntryHolder.defaultEntry, 12);
            this.unknownFields.writeTo(output);
        }
        
        @Override
        public int getSerializedSize() {
            int size = this.memoizedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            if (this.retcode_ != 0) {
                size += CodedOutputStream.computeInt32Size(2, this.retcode_);
            }
            for (int i = 0; i < this.itemList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(8, this.itemList_.get(i));
            }
            for (int i = 0; i < this.unk2700HBKHOBPGCLH_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(9, this.unk2700HBKHOBPGCLH_.get(i));
            }
            for (final Map.Entry<Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> entry : this.internalGetExpeditionInfoMap().getMap().entrySet()) {
                final MapEntry<Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> expeditionInfoMap__ = ExpeditionInfoMapDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build();
                size += CodedOutputStream.computeMessageSize(12, expeditionInfoMap__);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AvatarExpeditionGetRewardRsp)) {
                return super.equals(obj);
            }
            final AvatarExpeditionGetRewardRsp other = (AvatarExpeditionGetRewardRsp)obj;
            return this.getUnk2700HBKHOBPGCLHList().equals(other.getUnk2700HBKHOBPGCLHList()) && this.getItemListList().equals(other.getItemListList()) && this.internalGetExpeditionInfoMap().equals(other.internalGetExpeditionInfoMap()) && this.getRetcode() == other.getRetcode() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getUnk2700HBKHOBPGCLHCount() > 0) {
                hash = 37 * hash + 9;
                hash = 53 * hash + this.getUnk2700HBKHOBPGCLHList().hashCode();
            }
            if (this.getItemListCount() > 0) {
                hash = 37 * hash + 8;
                hash = 53 * hash + this.getItemListList().hashCode();
            }
            if (!this.internalGetExpeditionInfoMap().getMap().isEmpty()) {
                hash = 37 * hash + 12;
                hash = 53 * hash + this.internalGetExpeditionInfoMap().hashCode();
            }
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getRetcode();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static AvatarExpeditionGetRewardRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return AvatarExpeditionGetRewardRsp.PARSER.parseFrom(data);
        }
        
        public static AvatarExpeditionGetRewardRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarExpeditionGetRewardRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarExpeditionGetRewardRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return AvatarExpeditionGetRewardRsp.PARSER.parseFrom(data);
        }
        
        public static AvatarExpeditionGetRewardRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarExpeditionGetRewardRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarExpeditionGetRewardRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return AvatarExpeditionGetRewardRsp.PARSER.parseFrom(data);
        }
        
        public static AvatarExpeditionGetRewardRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarExpeditionGetRewardRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarExpeditionGetRewardRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarExpeditionGetRewardRsp.PARSER, input);
        }
        
        public static AvatarExpeditionGetRewardRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarExpeditionGetRewardRsp.PARSER, input, extensionRegistry);
        }
        
        public static AvatarExpeditionGetRewardRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AvatarExpeditionGetRewardRsp.PARSER, input);
        }
        
        public static AvatarExpeditionGetRewardRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AvatarExpeditionGetRewardRsp.PARSER, input, extensionRegistry);
        }
        
        public static AvatarExpeditionGetRewardRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarExpeditionGetRewardRsp.PARSER, input);
        }
        
        public static AvatarExpeditionGetRewardRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarExpeditionGetRewardRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return AvatarExpeditionGetRewardRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final AvatarExpeditionGetRewardRsp prototype) {
            return AvatarExpeditionGetRewardRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == AvatarExpeditionGetRewardRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static AvatarExpeditionGetRewardRsp getDefaultInstance() {
            return AvatarExpeditionGetRewardRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<AvatarExpeditionGetRewardRsp> parser() {
            return AvatarExpeditionGetRewardRsp.PARSER;
        }
        
        @Override
        public Parser<AvatarExpeditionGetRewardRsp> getParserForType() {
            return AvatarExpeditionGetRewardRsp.PARSER;
        }
        
        @Override
        public AvatarExpeditionGetRewardRsp getDefaultInstanceForType() {
            return AvatarExpeditionGetRewardRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new AvatarExpeditionGetRewardRsp();
            PARSER = new AbstractParser<AvatarExpeditionGetRewardRsp>() {
                @Override
                public AvatarExpeditionGetRewardRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new AvatarExpeditionGetRewardRsp(input, extensionRegistry);
                }
            };
        }
        
        private static final class ExpeditionInfoMapDefaultEntryHolder
        {
            static final MapEntry<Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> defaultEntry;
            
            static {
                defaultEntry = MapEntry.newDefaultInstance(AvatarExpeditionGetRewardRspOuterClass.internal_static_AvatarExpeditionGetRewardRsp_ExpeditionInfoMapEntry_descriptor, WireFormat.FieldType.UINT64, 0L, WireFormat.FieldType.MESSAGE, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo.getDefaultInstance());
            }
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AvatarExpeditionGetRewardRspOrBuilder
        {
            private int bitField0_;
            private List<ItemParamOuterClass.ItemParam> unk2700HBKHOBPGCLH_;
            private RepeatedFieldBuilderV3<ItemParamOuterClass.ItemParam, ItemParamOuterClass.ItemParam.Builder, ItemParamOuterClass.ItemParamOrBuilder> unk2700HBKHOBPGCLHBuilder_;
            private List<ItemParamOuterClass.ItemParam> itemList_;
            private RepeatedFieldBuilderV3<ItemParamOuterClass.ItemParam, ItemParamOuterClass.ItemParam.Builder, ItemParamOuterClass.ItemParamOrBuilder> itemListBuilder_;
            private MapField<Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> expeditionInfoMap_;
            private int retcode_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return AvatarExpeditionGetRewardRspOuterClass.internal_static_AvatarExpeditionGetRewardRsp_descriptor;
            }
            
            @Override
            protected MapField internalGetMapField(final int number) {
                switch (number) {
                    case 12: {
                        return this.internalGetExpeditionInfoMap();
                    }
                    default: {
                        throw new RuntimeException("Invalid map field number: " + number);
                    }
                }
            }
            
            @Override
            protected MapField internalGetMutableMapField(final int number) {
                switch (number) {
                    case 12: {
                        return this.internalGetMutableExpeditionInfoMap();
                    }
                    default: {
                        throw new RuntimeException("Invalid map field number: " + number);
                    }
                }
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return AvatarExpeditionGetRewardRspOuterClass.internal_static_AvatarExpeditionGetRewardRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(AvatarExpeditionGetRewardRsp.class, Builder.class);
            }
            
            private Builder() {
                this.unk2700HBKHOBPGCLH_ = Collections.emptyList();
                this.itemList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.unk2700HBKHOBPGCLH_ = Collections.emptyList();
                this.itemList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (AvatarExpeditionGetRewardRsp.alwaysUseFieldBuilders) {
                    this.getUnk2700HBKHOBPGCLHFieldBuilder();
                    this.getItemListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.unk2700HBKHOBPGCLHBuilder_ == null) {
                    this.unk2700HBKHOBPGCLH_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.unk2700HBKHOBPGCLHBuilder_.clear();
                }
                if (this.itemListBuilder_ == null) {
                    this.itemList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFD;
                }
                else {
                    this.itemListBuilder_.clear();
                }
                this.internalGetMutableExpeditionInfoMap().clear();
                this.retcode_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return AvatarExpeditionGetRewardRspOuterClass.internal_static_AvatarExpeditionGetRewardRsp_descriptor;
            }
            
            @Override
            public AvatarExpeditionGetRewardRsp getDefaultInstanceForType() {
                return AvatarExpeditionGetRewardRsp.getDefaultInstance();
            }
            
            @Override
            public AvatarExpeditionGetRewardRsp build() {
                final AvatarExpeditionGetRewardRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public AvatarExpeditionGetRewardRsp buildPartial() {
                final AvatarExpeditionGetRewardRsp result = new AvatarExpeditionGetRewardRsp(this);
                final int from_bitField0_ = this.bitField0_;
                if (this.unk2700HBKHOBPGCLHBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.unk2700HBKHOBPGCLH_ = Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParam>)this.unk2700HBKHOBPGCLH_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.unk2700HBKHOBPGCLH_ = this.unk2700HBKHOBPGCLH_;
                }
                else {
                    result.unk2700HBKHOBPGCLH_ = this.unk2700HBKHOBPGCLHBuilder_.build();
                }
                if (this.itemListBuilder_ == null) {
                    if ((this.bitField0_ & 0x2) != 0x0) {
                        this.itemList_ = Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParam>)this.itemList_);
                        this.bitField0_ &= 0xFFFFFFFD;
                    }
                    result.itemList_ = this.itemList_;
                }
                else {
                    result.itemList_ = this.itemListBuilder_.build();
                }
                (result.expeditionInfoMap_ = this.internalGetExpeditionInfoMap()).makeImmutable();
                result.retcode_ = this.retcode_;
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
                if (other instanceof AvatarExpeditionGetRewardRsp) {
                    return this.mergeFrom((AvatarExpeditionGetRewardRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final AvatarExpeditionGetRewardRsp other) {
                if (other == AvatarExpeditionGetRewardRsp.getDefaultInstance()) {
                    return this;
                }
                if (this.unk2700HBKHOBPGCLHBuilder_ == null) {
                    if (!other.unk2700HBKHOBPGCLH_.isEmpty()) {
                        if (this.unk2700HBKHOBPGCLH_.isEmpty()) {
                            this.unk2700HBKHOBPGCLH_ = other.unk2700HBKHOBPGCLH_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureUnk2700HBKHOBPGCLHIsMutable();
                            this.unk2700HBKHOBPGCLH_.addAll(other.unk2700HBKHOBPGCLH_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.unk2700HBKHOBPGCLH_.isEmpty()) {
                    if (this.unk2700HBKHOBPGCLHBuilder_.isEmpty()) {
                        this.unk2700HBKHOBPGCLHBuilder_.dispose();
                        this.unk2700HBKHOBPGCLHBuilder_ = null;
                        this.unk2700HBKHOBPGCLH_ = other.unk2700HBKHOBPGCLH_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.unk2700HBKHOBPGCLHBuilder_ = (AvatarExpeditionGetRewardRsp.alwaysUseFieldBuilders ? this.getUnk2700HBKHOBPGCLHFieldBuilder() : null);
                    }
                    else {
                        this.unk2700HBKHOBPGCLHBuilder_.addAllMessages(other.unk2700HBKHOBPGCLH_);
                    }
                }
                if (this.itemListBuilder_ == null) {
                    if (!other.itemList_.isEmpty()) {
                        if (this.itemList_.isEmpty()) {
                            this.itemList_ = other.itemList_;
                            this.bitField0_ &= 0xFFFFFFFD;
                        }
                        else {
                            this.ensureItemListIsMutable();
                            this.itemList_.addAll(other.itemList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.itemList_.isEmpty()) {
                    if (this.itemListBuilder_.isEmpty()) {
                        this.itemListBuilder_.dispose();
                        this.itemListBuilder_ = null;
                        this.itemList_ = other.itemList_;
                        this.bitField0_ &= 0xFFFFFFFD;
                        this.itemListBuilder_ = (AvatarExpeditionGetRewardRsp.alwaysUseFieldBuilders ? this.getItemListFieldBuilder() : null);
                    }
                    else {
                        this.itemListBuilder_.addAllMessages(other.itemList_);
                    }
                }
                this.internalGetMutableExpeditionInfoMap().mergeFrom(other.internalGetExpeditionInfoMap());
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
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
                AvatarExpeditionGetRewardRsp parsedMessage = null;
                try {
                    parsedMessage = AvatarExpeditionGetRewardRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (AvatarExpeditionGetRewardRsp)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureUnk2700HBKHOBPGCLHIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.unk2700HBKHOBPGCLH_ = new ArrayList<ItemParamOuterClass.ItemParam>(this.unk2700HBKHOBPGCLH_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<ItemParamOuterClass.ItemParam> getUnk2700HBKHOBPGCLHList() {
                if (this.unk2700HBKHOBPGCLHBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParam>)this.unk2700HBKHOBPGCLH_);
                }
                return this.unk2700HBKHOBPGCLHBuilder_.getMessageList();
            }
            
            @Override
            public int getUnk2700HBKHOBPGCLHCount() {
                if (this.unk2700HBKHOBPGCLHBuilder_ == null) {
                    return this.unk2700HBKHOBPGCLH_.size();
                }
                return this.unk2700HBKHOBPGCLHBuilder_.getCount();
            }
            
            @Override
            public ItemParamOuterClass.ItemParam getUnk2700HBKHOBPGCLH(final int index) {
                if (this.unk2700HBKHOBPGCLHBuilder_ == null) {
                    return this.unk2700HBKHOBPGCLH_.get(index);
                }
                return this.unk2700HBKHOBPGCLHBuilder_.getMessage(index);
            }
            
            public Builder setUnk2700HBKHOBPGCLH(final int index, final ItemParamOuterClass.ItemParam value) {
                if (this.unk2700HBKHOBPGCLHBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureUnk2700HBKHOBPGCLHIsMutable();
                    this.unk2700HBKHOBPGCLH_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.unk2700HBKHOBPGCLHBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setUnk2700HBKHOBPGCLH(final int index, final ItemParamOuterClass.ItemParam.Builder builderForValue) {
                if (this.unk2700HBKHOBPGCLHBuilder_ == null) {
                    this.ensureUnk2700HBKHOBPGCLHIsMutable();
                    this.unk2700HBKHOBPGCLH_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.unk2700HBKHOBPGCLHBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addUnk2700HBKHOBPGCLH(final ItemParamOuterClass.ItemParam value) {
                if (this.unk2700HBKHOBPGCLHBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureUnk2700HBKHOBPGCLHIsMutable();
                    this.unk2700HBKHOBPGCLH_.add(value);
                    this.onChanged();
                }
                else {
                    this.unk2700HBKHOBPGCLHBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addUnk2700HBKHOBPGCLH(final int index, final ItemParamOuterClass.ItemParam value) {
                if (this.unk2700HBKHOBPGCLHBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureUnk2700HBKHOBPGCLHIsMutable();
                    this.unk2700HBKHOBPGCLH_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.unk2700HBKHOBPGCLHBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addUnk2700HBKHOBPGCLH(final ItemParamOuterClass.ItemParam.Builder builderForValue) {
                if (this.unk2700HBKHOBPGCLHBuilder_ == null) {
                    this.ensureUnk2700HBKHOBPGCLHIsMutable();
                    this.unk2700HBKHOBPGCLH_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.unk2700HBKHOBPGCLHBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addUnk2700HBKHOBPGCLH(final int index, final ItemParamOuterClass.ItemParam.Builder builderForValue) {
                if (this.unk2700HBKHOBPGCLHBuilder_ == null) {
                    this.ensureUnk2700HBKHOBPGCLHIsMutable();
                    this.unk2700HBKHOBPGCLH_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.unk2700HBKHOBPGCLHBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllUnk2700HBKHOBPGCLH(final Iterable<? extends ItemParamOuterClass.ItemParam> values) {
                if (this.unk2700HBKHOBPGCLHBuilder_ == null) {
                    this.ensureUnk2700HBKHOBPGCLHIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.unk2700HBKHOBPGCLH_);
                    this.onChanged();
                }
                else {
                    this.unk2700HBKHOBPGCLHBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearUnk2700HBKHOBPGCLH() {
                if (this.unk2700HBKHOBPGCLHBuilder_ == null) {
                    this.unk2700HBKHOBPGCLH_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.unk2700HBKHOBPGCLHBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeUnk2700HBKHOBPGCLH(final int index) {
                if (this.unk2700HBKHOBPGCLHBuilder_ == null) {
                    this.ensureUnk2700HBKHOBPGCLHIsMutable();
                    this.unk2700HBKHOBPGCLH_.remove(index);
                    this.onChanged();
                }
                else {
                    this.unk2700HBKHOBPGCLHBuilder_.remove(index);
                }
                return this;
            }
            
            public ItemParamOuterClass.ItemParam.Builder getUnk2700HBKHOBPGCLHBuilder(final int index) {
                return this.getUnk2700HBKHOBPGCLHFieldBuilder().getBuilder(index);
            }
            
            @Override
            public ItemParamOuterClass.ItemParamOrBuilder getUnk2700HBKHOBPGCLHOrBuilder(final int index) {
                if (this.unk2700HBKHOBPGCLHBuilder_ == null) {
                    return this.unk2700HBKHOBPGCLH_.get(index);
                }
                return this.unk2700HBKHOBPGCLHBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends ItemParamOuterClass.ItemParamOrBuilder> getUnk2700HBKHOBPGCLHOrBuilderList() {
                if (this.unk2700HBKHOBPGCLHBuilder_ != null) {
                    return this.unk2700HBKHOBPGCLHBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParamOrBuilder>)this.unk2700HBKHOBPGCLH_);
            }
            
            public ItemParamOuterClass.ItemParam.Builder addUnk2700HBKHOBPGCLHBuilder() {
                return this.getUnk2700HBKHOBPGCLHFieldBuilder().addBuilder(ItemParamOuterClass.ItemParam.getDefaultInstance());
            }
            
            public ItemParamOuterClass.ItemParam.Builder addUnk2700HBKHOBPGCLHBuilder(final int index) {
                return this.getUnk2700HBKHOBPGCLHFieldBuilder().addBuilder(index, ItemParamOuterClass.ItemParam.getDefaultInstance());
            }
            
            public List<ItemParamOuterClass.ItemParam.Builder> getUnk2700HBKHOBPGCLHBuilderList() {
                return this.getUnk2700HBKHOBPGCLHFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<ItemParamOuterClass.ItemParam, ItemParamOuterClass.ItemParam.Builder, ItemParamOuterClass.ItemParamOrBuilder> getUnk2700HBKHOBPGCLHFieldBuilder() {
                if (this.unk2700HBKHOBPGCLHBuilder_ == null) {
                    this.unk2700HBKHOBPGCLHBuilder_ = new RepeatedFieldBuilderV3<ItemParamOuterClass.ItemParam, ItemParamOuterClass.ItemParam.Builder, ItemParamOuterClass.ItemParamOrBuilder>(this.unk2700HBKHOBPGCLH_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.unk2700HBKHOBPGCLH_ = null;
                }
                return this.unk2700HBKHOBPGCLHBuilder_;
            }
            
            private void ensureItemListIsMutable() {
                if ((this.bitField0_ & 0x2) == 0x0) {
                    this.itemList_ = new ArrayList<ItemParamOuterClass.ItemParam>(this.itemList_);
                    this.bitField0_ |= 0x2;
                }
            }
            
            @Override
            public List<ItemParamOuterClass.ItemParam> getItemListList() {
                if (this.itemListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParam>)this.itemList_);
                }
                return this.itemListBuilder_.getMessageList();
            }
            
            @Override
            public int getItemListCount() {
                if (this.itemListBuilder_ == null) {
                    return this.itemList_.size();
                }
                return this.itemListBuilder_.getCount();
            }
            
            @Override
            public ItemParamOuterClass.ItemParam getItemList(final int index) {
                if (this.itemListBuilder_ == null) {
                    return this.itemList_.get(index);
                }
                return this.itemListBuilder_.getMessage(index);
            }
            
            public Builder setItemList(final int index, final ItemParamOuterClass.ItemParam value) {
                if (this.itemListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureItemListIsMutable();
                    this.itemList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.itemListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setItemList(final int index, final ItemParamOuterClass.ItemParam.Builder builderForValue) {
                if (this.itemListBuilder_ == null) {
                    this.ensureItemListIsMutable();
                    this.itemList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.itemListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addItemList(final ItemParamOuterClass.ItemParam value) {
                if (this.itemListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureItemListIsMutable();
                    this.itemList_.add(value);
                    this.onChanged();
                }
                else {
                    this.itemListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addItemList(final int index, final ItemParamOuterClass.ItemParam value) {
                if (this.itemListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureItemListIsMutable();
                    this.itemList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.itemListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addItemList(final ItemParamOuterClass.ItemParam.Builder builderForValue) {
                if (this.itemListBuilder_ == null) {
                    this.ensureItemListIsMutable();
                    this.itemList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.itemListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addItemList(final int index, final ItemParamOuterClass.ItemParam.Builder builderForValue) {
                if (this.itemListBuilder_ == null) {
                    this.ensureItemListIsMutable();
                    this.itemList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.itemListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllItemList(final Iterable<? extends ItemParamOuterClass.ItemParam> values) {
                if (this.itemListBuilder_ == null) {
                    this.ensureItemListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.itemList_);
                    this.onChanged();
                }
                else {
                    this.itemListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearItemList() {
                if (this.itemListBuilder_ == null) {
                    this.itemList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFD;
                    this.onChanged();
                }
                else {
                    this.itemListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeItemList(final int index) {
                if (this.itemListBuilder_ == null) {
                    this.ensureItemListIsMutable();
                    this.itemList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.itemListBuilder_.remove(index);
                }
                return this;
            }
            
            public ItemParamOuterClass.ItemParam.Builder getItemListBuilder(final int index) {
                return this.getItemListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public ItemParamOuterClass.ItemParamOrBuilder getItemListOrBuilder(final int index) {
                if (this.itemListBuilder_ == null) {
                    return this.itemList_.get(index);
                }
                return this.itemListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends ItemParamOuterClass.ItemParamOrBuilder> getItemListOrBuilderList() {
                if (this.itemListBuilder_ != null) {
                    return this.itemListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParamOrBuilder>)this.itemList_);
            }
            
            public ItemParamOuterClass.ItemParam.Builder addItemListBuilder() {
                return this.getItemListFieldBuilder().addBuilder(ItemParamOuterClass.ItemParam.getDefaultInstance());
            }
            
            public ItemParamOuterClass.ItemParam.Builder addItemListBuilder(final int index) {
                return this.getItemListFieldBuilder().addBuilder(index, ItemParamOuterClass.ItemParam.getDefaultInstance());
            }
            
            public List<ItemParamOuterClass.ItemParam.Builder> getItemListBuilderList() {
                return this.getItemListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<ItemParamOuterClass.ItemParam, ItemParamOuterClass.ItemParam.Builder, ItemParamOuterClass.ItemParamOrBuilder> getItemListFieldBuilder() {
                if (this.itemListBuilder_ == null) {
                    this.itemListBuilder_ = new RepeatedFieldBuilderV3<ItemParamOuterClass.ItemParam, ItemParamOuterClass.ItemParam.Builder, ItemParamOuterClass.ItemParamOrBuilder>(this.itemList_, (this.bitField0_ & 0x2) != 0x0, this.getParentForChildren(), this.isClean());
                    this.itemList_ = null;
                }
                return this.itemListBuilder_;
            }
            
            private MapField<Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> internalGetExpeditionInfoMap() {
                if (this.expeditionInfoMap_ == null) {
                    return MapField.emptyMapField(ExpeditionInfoMapDefaultEntryHolder.defaultEntry);
                }
                return this.expeditionInfoMap_;
            }
            
            private MapField<Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> internalGetMutableExpeditionInfoMap() {
                this.onChanged();
                if (this.expeditionInfoMap_ == null) {
                    this.expeditionInfoMap_ = MapField.newMapField(ExpeditionInfoMapDefaultEntryHolder.defaultEntry);
                }
                if (!this.expeditionInfoMap_.isMutable()) {
                    this.expeditionInfoMap_ = this.expeditionInfoMap_.copy();
                }
                return this.expeditionInfoMap_;
            }
            
            @Override
            public int getExpeditionInfoMapCount() {
                return this.internalGetExpeditionInfoMap().getMap().size();
            }
            
            @Override
            public boolean containsExpeditionInfoMap(final long key) {
                return this.internalGetExpeditionInfoMap().getMap().containsKey(key);
            }
            
            @Deprecated
            @Override
            public Map<Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> getExpeditionInfoMap() {
                return this.getExpeditionInfoMapMap();
            }
            
            @Override
            public Map<Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> getExpeditionInfoMapMap() {
                return this.internalGetExpeditionInfoMap().getMap();
            }
            
            @Override
            public AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo getExpeditionInfoMapOrDefault(final long key, final AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo defaultValue) {
                final Map<Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> map = this.internalGetExpeditionInfoMap().getMap();
                return map.containsKey(key) ? map.get(key) : defaultValue;
            }
            
            @Override
            public AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo getExpeditionInfoMapOrThrow(final long key) {
                final Map<Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> map = this.internalGetExpeditionInfoMap().getMap();
                if (!map.containsKey(key)) {
                    throw new IllegalArgumentException();
                }
                return map.get(key);
            }
            
            public Builder clearExpeditionInfoMap() {
                this.internalGetMutableExpeditionInfoMap().getMutableMap().clear();
                return this;
            }
            
            public Builder removeExpeditionInfoMap(final long key) {
                this.internalGetMutableExpeditionInfoMap().getMutableMap().remove(key);
                return this;
            }
            
            @Deprecated
            public Map<Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> getMutableExpeditionInfoMap() {
                return this.internalGetMutableExpeditionInfoMap().getMutableMap();
            }
            
            public Builder putExpeditionInfoMap(final long key, final AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.internalGetMutableExpeditionInfoMap().getMutableMap().put(key, value);
                return this;
            }
            
            public Builder putAllExpeditionInfoMap(final Map<Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> values) {
                this.internalGetMutableExpeditionInfoMap().getMutableMap().putAll(values);
                return this;
            }
            
            @Override
            public int getRetcode() {
                return this.retcode_;
            }
            
            public Builder setRetcode(final int value) {
                this.retcode_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearRetcode() {
                this.retcode_ = 0;
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
    
    public interface AvatarExpeditionGetRewardRspOrBuilder extends MessageOrBuilder
    {
        List<ItemParamOuterClass.ItemParam> getUnk2700HBKHOBPGCLHList();
        
        ItemParamOuterClass.ItemParam getUnk2700HBKHOBPGCLH(final int p0);
        
        int getUnk2700HBKHOBPGCLHCount();
        
        List<? extends ItemParamOuterClass.ItemParamOrBuilder> getUnk2700HBKHOBPGCLHOrBuilderList();
        
        ItemParamOuterClass.ItemParamOrBuilder getUnk2700HBKHOBPGCLHOrBuilder(final int p0);
        
        List<ItemParamOuterClass.ItemParam> getItemListList();
        
        ItemParamOuterClass.ItemParam getItemList(final int p0);
        
        int getItemListCount();
        
        List<? extends ItemParamOuterClass.ItemParamOrBuilder> getItemListOrBuilderList();
        
        ItemParamOuterClass.ItemParamOrBuilder getItemListOrBuilder(final int p0);
        
        int getExpeditionInfoMapCount();
        
        boolean containsExpeditionInfoMap(final long p0);
        
        @Deprecated
        Map<Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> getExpeditionInfoMap();
        
        Map<Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> getExpeditionInfoMapMap();
        
        AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo getExpeditionInfoMapOrDefault(final long p0, final AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo p1);
        
        AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo getExpeditionInfoMapOrThrow(final long p0);
        
        int getRetcode();
    }
}
