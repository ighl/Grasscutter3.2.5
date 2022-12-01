// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collections;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import java.util.List;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.Internal;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class VehicleLocationInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_VehicleLocationInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_VehicleLocationInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private VehicleLocationInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return VehicleLocationInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0019VehicleLocationInfo.proto\u001a\fVector.proto\"¬\u0001\n\u0013VehicleLocationInfo\u0012\u0014\n\u0003rot\u0018\u000e \u0001(\u000b2\u0007.Vector\u0012\u0011\n\tentity_id\u0018\u000f \u0001(\r\u0012\u000e\n\u0006cur_hp\u0018\u000b \u0001(\u0002\u0012\u0011\n\towner_uid\u0018\u0005 \u0001(\r\u0012\u0014\n\u0003pos\u0018\u0001 \u0001(\u000b2\u0007.Vector\u0012\u0010\n\buid_list\u0018\u0003 \u0003(\r\u0012\u0011\n\tgadget_id\u0018\r \u0001(\r\u0012\u000e\n\u0006max_hp\u0018\u0006 \u0001(\u0002B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        VehicleLocationInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { VectorOuterClass.getDescriptor() });
        internal_static_VehicleLocationInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_VehicleLocationInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(VehicleLocationInfoOuterClass.internal_static_VehicleLocationInfo_descriptor, new String[] { "Rot", "EntityId", "CurHp", "OwnerUid", "Pos", "UidList", "GadgetId", "MaxHp" });
        VectorOuterClass.getDescriptor();
    }
    
    public static final class VehicleLocationInfo extends GeneratedMessageV3 implements VehicleLocationInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int ROT_FIELD_NUMBER = 14;
        private VectorOuterClass.Vector rot_;
        public static final int ENTITY_ID_FIELD_NUMBER = 15;
        private int entityId_;
        public static final int CUR_HP_FIELD_NUMBER = 11;
        private float curHp_;
        public static final int OWNER_UID_FIELD_NUMBER = 5;
        private int ownerUid_;
        public static final int POS_FIELD_NUMBER = 1;
        private VectorOuterClass.Vector pos_;
        public static final int UID_LIST_FIELD_NUMBER = 3;
        private Internal.IntList uidList_;
        private int uidListMemoizedSerializedSize;
        public static final int GADGET_ID_FIELD_NUMBER = 13;
        private int gadgetId_;
        public static final int MAX_HP_FIELD_NUMBER = 6;
        private float maxHp_;
        private byte memoizedIsInitialized;
        private static final VehicleLocationInfo DEFAULT_INSTANCE;
        private static final Parser<VehicleLocationInfo> PARSER;
        
        private VehicleLocationInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.uidListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private VehicleLocationInfo() {
            this.uidListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.uidList_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new VehicleLocationInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private VehicleLocationInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 10: {
                            VectorOuterClass.Vector.Builder subBuilder = null;
                            if (this.pos_ != null) {
                                subBuilder = this.pos_.toBuilder();
                            }
                            this.pos_ = input.readMessage(VectorOuterClass.Vector.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.pos_);
                                this.pos_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 24: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.uidList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.uidList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 26: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.uidList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.uidList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 40: {
                            this.ownerUid_ = input.readUInt32();
                            continue;
                        }
                        case 53: {
                            this.maxHp_ = input.readFloat();
                            continue;
                        }
                        case 93: {
                            this.curHp_ = input.readFloat();
                            continue;
                        }
                        case 104: {
                            this.gadgetId_ = input.readUInt32();
                            continue;
                        }
                        case 114: {
                            VectorOuterClass.Vector.Builder subBuilder = null;
                            if (this.rot_ != null) {
                                subBuilder = this.rot_.toBuilder();
                            }
                            this.rot_ = input.readMessage(VectorOuterClass.Vector.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.rot_);
                                this.rot_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 120: {
                            this.entityId_ = input.readUInt32();
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
                    this.uidList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return VehicleLocationInfoOuterClass.internal_static_VehicleLocationInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return VehicleLocationInfoOuterClass.internal_static_VehicleLocationInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(VehicleLocationInfo.class, Builder.class);
        }
        
        @Override
        public boolean hasRot() {
            return this.rot_ != null;
        }
        
        @Override
        public VectorOuterClass.Vector getRot() {
            return (this.rot_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.rot_;
        }
        
        @Override
        public VectorOuterClass.VectorOrBuilder getRotOrBuilder() {
            return this.getRot();
        }
        
        @Override
        public int getEntityId() {
            return this.entityId_;
        }
        
        @Override
        public float getCurHp() {
            return this.curHp_;
        }
        
        @Override
        public int getOwnerUid() {
            return this.ownerUid_;
        }
        
        @Override
        public boolean hasPos() {
            return this.pos_ != null;
        }
        
        @Override
        public VectorOuterClass.Vector getPos() {
            return (this.pos_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.pos_;
        }
        
        @Override
        public VectorOuterClass.VectorOrBuilder getPosOrBuilder() {
            return this.getPos();
        }
        
        @Override
        public List<Integer> getUidListList() {
            return this.uidList_;
        }
        
        @Override
        public int getUidListCount() {
            return this.uidList_.size();
        }
        
        @Override
        public int getUidList(final int index) {
            return this.uidList_.getInt(index);
        }
        
        @Override
        public int getGadgetId() {
            return this.gadgetId_;
        }
        
        @Override
        public float getMaxHp() {
            return this.maxHp_;
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
            if (this.pos_ != null) {
                output.writeMessage(1, this.getPos());
            }
            if (this.getUidListList().size() > 0) {
                output.writeUInt32NoTag(26);
                output.writeUInt32NoTag(this.uidListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.uidList_.size(); ++i) {
                output.writeUInt32NoTag(this.uidList_.getInt(i));
            }
            if (this.ownerUid_ != 0) {
                output.writeUInt32(5, this.ownerUid_);
            }
            if (this.maxHp_ != 0.0f) {
                output.writeFloat(6, this.maxHp_);
            }
            if (this.curHp_ != 0.0f) {
                output.writeFloat(11, this.curHp_);
            }
            if (this.gadgetId_ != 0) {
                output.writeUInt32(13, this.gadgetId_);
            }
            if (this.rot_ != null) {
                output.writeMessage(14, this.getRot());
            }
            if (this.entityId_ != 0) {
                output.writeUInt32(15, this.entityId_);
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
            if (this.pos_ != null) {
                size += CodedOutputStream.computeMessageSize(1, this.getPos());
            }
            int dataSize = 0;
            for (int i = 0; i < this.uidList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.uidList_.getInt(i));
            }
            size += dataSize;
            if (!this.getUidListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.uidListMemoizedSerializedSize = dataSize;
            if (this.ownerUid_ != 0) {
                size += CodedOutputStream.computeUInt32Size(5, this.ownerUid_);
            }
            if (this.maxHp_ != 0.0f) {
                size += CodedOutputStream.computeFloatSize(6, this.maxHp_);
            }
            if (this.curHp_ != 0.0f) {
                size += CodedOutputStream.computeFloatSize(11, this.curHp_);
            }
            if (this.gadgetId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(13, this.gadgetId_);
            }
            if (this.rot_ != null) {
                size += CodedOutputStream.computeMessageSize(14, this.getRot());
            }
            if (this.entityId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(15, this.entityId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof VehicleLocationInfo)) {
                return super.equals(obj);
            }
            final VehicleLocationInfo other = (VehicleLocationInfo)obj;
            return this.hasRot() == other.hasRot() && (!this.hasRot() || this.getRot().equals(other.getRot())) && this.getEntityId() == other.getEntityId() && Float.floatToIntBits(this.getCurHp()) == Float.floatToIntBits(other.getCurHp()) && this.getOwnerUid() == other.getOwnerUid() && this.hasPos() == other.hasPos() && (!this.hasPos() || this.getPos().equals(other.getPos())) && this.getUidListList().equals(other.getUidListList()) && this.getGadgetId() == other.getGadgetId() && Float.floatToIntBits(this.getMaxHp()) == Float.floatToIntBits(other.getMaxHp()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasRot()) {
                hash = 37 * hash + 14;
                hash = 53 * hash + this.getRot().hashCode();
            }
            hash = 37 * hash + 15;
            hash = 53 * hash + this.getEntityId();
            hash = 37 * hash + 11;
            hash = 53 * hash + Float.floatToIntBits(this.getCurHp());
            hash = 37 * hash + 5;
            hash = 53 * hash + this.getOwnerUid();
            if (this.hasPos()) {
                hash = 37 * hash + 1;
                hash = 53 * hash + this.getPos().hashCode();
            }
            if (this.getUidListCount() > 0) {
                hash = 37 * hash + 3;
                hash = 53 * hash + this.getUidListList().hashCode();
            }
            hash = 37 * hash + 13;
            hash = 53 * hash + this.getGadgetId();
            hash = 37 * hash + 6;
            hash = 53 * hash + Float.floatToIntBits(this.getMaxHp());
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static VehicleLocationInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return VehicleLocationInfo.PARSER.parseFrom(data);
        }
        
        public static VehicleLocationInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return VehicleLocationInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static VehicleLocationInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return VehicleLocationInfo.PARSER.parseFrom(data);
        }
        
        public static VehicleLocationInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return VehicleLocationInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static VehicleLocationInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return VehicleLocationInfo.PARSER.parseFrom(data);
        }
        
        public static VehicleLocationInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return VehicleLocationInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static VehicleLocationInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(VehicleLocationInfo.PARSER, input);
        }
        
        public static VehicleLocationInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(VehicleLocationInfo.PARSER, input, extensionRegistry);
        }
        
        public static VehicleLocationInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(VehicleLocationInfo.PARSER, input);
        }
        
        public static VehicleLocationInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(VehicleLocationInfo.PARSER, input, extensionRegistry);
        }
        
        public static VehicleLocationInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(VehicleLocationInfo.PARSER, input);
        }
        
        public static VehicleLocationInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(VehicleLocationInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return VehicleLocationInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final VehicleLocationInfo prototype) {
            return VehicleLocationInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == VehicleLocationInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static VehicleLocationInfo getDefaultInstance() {
            return VehicleLocationInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<VehicleLocationInfo> parser() {
            return VehicleLocationInfo.PARSER;
        }
        
        @Override
        public Parser<VehicleLocationInfo> getParserForType() {
            return VehicleLocationInfo.PARSER;
        }
        
        @Override
        public VehicleLocationInfo getDefaultInstanceForType() {
            return VehicleLocationInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new VehicleLocationInfo();
            PARSER = new AbstractParser<VehicleLocationInfo>() {
                @Override
                public VehicleLocationInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new VehicleLocationInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements VehicleLocationInfoOrBuilder
        {
            private int bitField0_;
            private VectorOuterClass.Vector rot_;
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> rotBuilder_;
            private int entityId_;
            private float curHp_;
            private int ownerUid_;
            private VectorOuterClass.Vector pos_;
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> posBuilder_;
            private Internal.IntList uidList_;
            private int gadgetId_;
            private float maxHp_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return VehicleLocationInfoOuterClass.internal_static_VehicleLocationInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return VehicleLocationInfoOuterClass.internal_static_VehicleLocationInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(VehicleLocationInfo.class, Builder.class);
            }
            
            private Builder() {
                this.uidList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.uidList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (VehicleLocationInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.rotBuilder_ == null) {
                    this.rot_ = null;
                }
                else {
                    this.rot_ = null;
                    this.rotBuilder_ = null;
                }
                this.entityId_ = 0;
                this.curHp_ = 0.0f;
                this.ownerUid_ = 0;
                if (this.posBuilder_ == null) {
                    this.pos_ = null;
                }
                else {
                    this.pos_ = null;
                    this.posBuilder_ = null;
                }
                this.uidList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.gadgetId_ = 0;
                this.maxHp_ = 0.0f;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return VehicleLocationInfoOuterClass.internal_static_VehicleLocationInfo_descriptor;
            }
            
            @Override
            public VehicleLocationInfo getDefaultInstanceForType() {
                return VehicleLocationInfo.getDefaultInstance();
            }
            
            @Override
            public VehicleLocationInfo build() {
                final VehicleLocationInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public VehicleLocationInfo buildPartial() {
                final VehicleLocationInfo result = new VehicleLocationInfo(this);
                final int from_bitField0_ = this.bitField0_;
                if (this.rotBuilder_ == null) {
                    result.rot_ = this.rot_;
                }
                else {
                    result.rot_ = this.rotBuilder_.build();
                }
                result.entityId_ = this.entityId_;
                result.curHp_ = this.curHp_;
                result.ownerUid_ = this.ownerUid_;
                if (this.posBuilder_ == null) {
                    result.pos_ = this.pos_;
                }
                else {
                    result.pos_ = this.posBuilder_.build();
                }
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.uidList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.uidList_ = this.uidList_;
                result.gadgetId_ = this.gadgetId_;
                result.maxHp_ = this.maxHp_;
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
                if (other instanceof VehicleLocationInfo) {
                    return this.mergeFrom((VehicleLocationInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final VehicleLocationInfo other) {
                if (other == VehicleLocationInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.hasRot()) {
                    this.mergeRot(other.getRot());
                }
                if (other.getEntityId() != 0) {
                    this.setEntityId(other.getEntityId());
                }
                if (other.getCurHp() != 0.0f) {
                    this.setCurHp(other.getCurHp());
                }
                if (other.getOwnerUid() != 0) {
                    this.setOwnerUid(other.getOwnerUid());
                }
                if (other.hasPos()) {
                    this.mergePos(other.getPos());
                }
                if (!other.uidList_.isEmpty()) {
                    if (this.uidList_.isEmpty()) {
                        this.uidList_ = other.uidList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureUidListIsMutable();
                        this.uidList_.addAll(other.uidList_);
                    }
                    this.onChanged();
                }
                if (other.getGadgetId() != 0) {
                    this.setGadgetId(other.getGadgetId());
                }
                if (other.getMaxHp() != 0.0f) {
                    this.setMaxHp(other.getMaxHp());
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
                VehicleLocationInfo parsedMessage = null;
                try {
                    parsedMessage = VehicleLocationInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (VehicleLocationInfo)e.getUnfinishedMessage();
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
            public boolean hasRot() {
                return this.rotBuilder_ != null || this.rot_ != null;
            }
            
            @Override
            public VectorOuterClass.Vector getRot() {
                if (this.rotBuilder_ == null) {
                    return (this.rot_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.rot_;
                }
                return this.rotBuilder_.getMessage();
            }
            
            public Builder setRot(final VectorOuterClass.Vector value) {
                if (this.rotBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.rot_ = value;
                    this.onChanged();
                }
                else {
                    this.rotBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setRot(final VectorOuterClass.Vector.Builder builderForValue) {
                if (this.rotBuilder_ == null) {
                    this.rot_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.rotBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeRot(final VectorOuterClass.Vector value) {
                if (this.rotBuilder_ == null) {
                    if (this.rot_ != null) {
                        this.rot_ = VectorOuterClass.Vector.newBuilder(this.rot_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.rot_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.rotBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearRot() {
                if (this.rotBuilder_ == null) {
                    this.rot_ = null;
                    this.onChanged();
                }
                else {
                    this.rot_ = null;
                    this.rotBuilder_ = null;
                }
                return this;
            }
            
            public VectorOuterClass.Vector.Builder getRotBuilder() {
                this.onChanged();
                return this.getRotFieldBuilder().getBuilder();
            }
            
            @Override
            public VectorOuterClass.VectorOrBuilder getRotOrBuilder() {
                if (this.rotBuilder_ != null) {
                    return this.rotBuilder_.getMessageOrBuilder();
                }
                return (this.rot_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.rot_;
            }
            
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> getRotFieldBuilder() {
                if (this.rotBuilder_ == null) {
                    this.rotBuilder_ = new SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder>(this.getRot(), this.getParentForChildren(), this.isClean());
                    this.rot_ = null;
                }
                return this.rotBuilder_;
            }
            
            @Override
            public int getEntityId() {
                return this.entityId_;
            }
            
            public Builder setEntityId(final int value) {
                this.entityId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearEntityId() {
                this.entityId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public float getCurHp() {
                return this.curHp_;
            }
            
            public Builder setCurHp(final float value) {
                this.curHp_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCurHp() {
                this.curHp_ = 0.0f;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getOwnerUid() {
                return this.ownerUid_;
            }
            
            public Builder setOwnerUid(final int value) {
                this.ownerUid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearOwnerUid() {
                this.ownerUid_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasPos() {
                return this.posBuilder_ != null || this.pos_ != null;
            }
            
            @Override
            public VectorOuterClass.Vector getPos() {
                if (this.posBuilder_ == null) {
                    return (this.pos_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.pos_;
                }
                return this.posBuilder_.getMessage();
            }
            
            public Builder setPos(final VectorOuterClass.Vector value) {
                if (this.posBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.pos_ = value;
                    this.onChanged();
                }
                else {
                    this.posBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setPos(final VectorOuterClass.Vector.Builder builderForValue) {
                if (this.posBuilder_ == null) {
                    this.pos_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.posBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergePos(final VectorOuterClass.Vector value) {
                if (this.posBuilder_ == null) {
                    if (this.pos_ != null) {
                        this.pos_ = VectorOuterClass.Vector.newBuilder(this.pos_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.pos_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.posBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearPos() {
                if (this.posBuilder_ == null) {
                    this.pos_ = null;
                    this.onChanged();
                }
                else {
                    this.pos_ = null;
                    this.posBuilder_ = null;
                }
                return this;
            }
            
            public VectorOuterClass.Vector.Builder getPosBuilder() {
                this.onChanged();
                return this.getPosFieldBuilder().getBuilder();
            }
            
            @Override
            public VectorOuterClass.VectorOrBuilder getPosOrBuilder() {
                if (this.posBuilder_ != null) {
                    return this.posBuilder_.getMessageOrBuilder();
                }
                return (this.pos_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.pos_;
            }
            
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> getPosFieldBuilder() {
                if (this.posBuilder_ == null) {
                    this.posBuilder_ = new SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder>(this.getPos(), this.getParentForChildren(), this.isClean());
                    this.pos_ = null;
                }
                return this.posBuilder_;
            }
            
            private void ensureUidListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.uidList_ = GeneratedMessageV3.mutableCopy(this.uidList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getUidListList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.uidList_) : this.uidList_;
            }
            
            @Override
            public int getUidListCount() {
                return this.uidList_.size();
            }
            
            @Override
            public int getUidList(final int index) {
                return this.uidList_.getInt(index);
            }
            
            public Builder setUidList(final int index, final int value) {
                this.ensureUidListIsMutable();
                this.uidList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addUidList(final int value) {
                this.ensureUidListIsMutable();
                this.uidList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllUidList(final Iterable<? extends Integer> values) {
                this.ensureUidListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.uidList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearUidList() {
                this.uidList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getGadgetId() {
                return this.gadgetId_;
            }
            
            public Builder setGadgetId(final int value) {
                this.gadgetId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearGadgetId() {
                this.gadgetId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public float getMaxHp() {
                return this.maxHp_;
            }
            
            public Builder setMaxHp(final float value) {
                this.maxHp_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearMaxHp() {
                this.maxHp_ = 0.0f;
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
    
    public interface VehicleLocationInfoOrBuilder extends MessageOrBuilder
    {
        boolean hasRot();
        
        VectorOuterClass.Vector getRot();
        
        VectorOuterClass.VectorOrBuilder getRotOrBuilder();
        
        int getEntityId();
        
        float getCurHp();
        
        int getOwnerUid();
        
        boolean hasPos();
        
        VectorOuterClass.Vector getPos();
        
        VectorOuterClass.VectorOrBuilder getPosOrBuilder();
        
        List<Integer> getUidListList();
        
        int getUidListCount();
        
        int getUidList(final int p0);
        
        int getGadgetId();
        
        float getMaxHp();
    }
}
