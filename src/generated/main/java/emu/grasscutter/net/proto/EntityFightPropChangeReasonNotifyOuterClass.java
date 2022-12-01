// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collections;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
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

public final class EntityFightPropChangeReasonNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_EntityFightPropChangeReasonNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_EntityFightPropChangeReasonNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private EntityFightPropChangeReasonNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return EntityFightPropChangeReasonNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n'EntityFightPropChangeReasonNotify.proto\u001a\u0018ChangeEnergyReason.proto\u001a\u0014ChangeHpReason.proto\u001a\u0016PropChangeReason.proto\"\u00f1\u0001\n!EntityFightPropChangeReasonNotify\u0012\u0012\n\nparam_list\u0018\n \u0003(\r\u0012\u0012\n\nprop_delta\u0018\r \u0001(\u0002\u0012)\n\u0010change_hp_reason\u0018\f \u0001(\u000e2\u000f.ChangeHpReason\u0012!\n\u0006reason\u0018\u0007 \u0001(\u000e2\u0011.PropChangeReason\u0012\u0011\n\tentity_id\u0018\u000e \u0001(\r\u00120\n\u0013change_energy_reson\u0018\t \u0001(\u000e2\u0013.ChangeEnergyReason\u0012\u0011\n\tprop_type\u0018\u0003 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        EntityFightPropChangeReasonNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { ChangeEnergyReasonOuterClass.getDescriptor(), ChangeHpReasonOuterClass.getDescriptor(), PropChangeReasonOuterClass.getDescriptor() });
        internal_static_EntityFightPropChangeReasonNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_EntityFightPropChangeReasonNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(EntityFightPropChangeReasonNotifyOuterClass.internal_static_EntityFightPropChangeReasonNotify_descriptor, new String[] { "ParamList", "PropDelta", "ChangeHpReason", "Reason", "EntityId", "ChangeEnergyReson", "PropType" });
        ChangeEnergyReasonOuterClass.getDescriptor();
        ChangeHpReasonOuterClass.getDescriptor();
        PropChangeReasonOuterClass.getDescriptor();
    }
    
    public static final class EntityFightPropChangeReasonNotify extends GeneratedMessageV3 implements EntityFightPropChangeReasonNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int PARAM_LIST_FIELD_NUMBER = 10;
        private Internal.IntList paramList_;
        private int paramListMemoizedSerializedSize;
        public static final int PROP_DELTA_FIELD_NUMBER = 13;
        private float propDelta_;
        public static final int CHANGE_HP_REASON_FIELD_NUMBER = 12;
        private int changeHpReason_;
        public static final int REASON_FIELD_NUMBER = 7;
        private int reason_;
        public static final int ENTITY_ID_FIELD_NUMBER = 14;
        private int entityId_;
        public static final int CHANGE_ENERGY_RESON_FIELD_NUMBER = 9;
        private int changeEnergyReson_;
        public static final int PROP_TYPE_FIELD_NUMBER = 3;
        private int propType_;
        private byte memoizedIsInitialized;
        private static final EntityFightPropChangeReasonNotify DEFAULT_INSTANCE;
        private static final Parser<EntityFightPropChangeReasonNotify> PARSER;
        
        private EntityFightPropChangeReasonNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.paramListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private EntityFightPropChangeReasonNotify() {
            this.paramListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.paramList_ = GeneratedMessageV3.emptyIntList();
            this.changeHpReason_ = 0;
            this.reason_ = 0;
            this.changeEnergyReson_ = 0;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new EntityFightPropChangeReasonNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private EntityFightPropChangeReasonNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 24: {
                            this.propType_ = input.readUInt32();
                            continue;
                        }
                        case 56: {
                            final int rawValue = input.readEnum();
                            this.reason_ = rawValue;
                            continue;
                        }
                        case 72: {
                            final int rawValue = input.readEnum();
                            this.changeEnergyReson_ = rawValue;
                            continue;
                        }
                        case 80: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.paramList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.paramList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 82: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.paramList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.paramList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 96: {
                            final int rawValue = input.readEnum();
                            this.changeHpReason_ = rawValue;
                            continue;
                        }
                        case 109: {
                            this.propDelta_ = input.readFloat();
                            continue;
                        }
                        case 112: {
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
                    this.paramList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return EntityFightPropChangeReasonNotifyOuterClass.internal_static_EntityFightPropChangeReasonNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return EntityFightPropChangeReasonNotifyOuterClass.internal_static_EntityFightPropChangeReasonNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(EntityFightPropChangeReasonNotify.class, Builder.class);
        }
        
        @Override
        public List<Integer> getParamListList() {
            return this.paramList_;
        }
        
        @Override
        public int getParamListCount() {
            return this.paramList_.size();
        }
        
        @Override
        public int getParamList(final int index) {
            return this.paramList_.getInt(index);
        }
        
        @Override
        public float getPropDelta() {
            return this.propDelta_;
        }
        
        @Override
        public int getChangeHpReasonValue() {
            return this.changeHpReason_;
        }
        
        @Override
        public ChangeHpReasonOuterClass.ChangeHpReason getChangeHpReason() {
            final ChangeHpReasonOuterClass.ChangeHpReason result = ChangeHpReasonOuterClass.ChangeHpReason.valueOf(this.changeHpReason_);
            return (result == null) ? ChangeHpReasonOuterClass.ChangeHpReason.UNRECOGNIZED : result;
        }
        
        @Override
        public int getReasonValue() {
            return this.reason_;
        }
        
        @Override
        public PropChangeReasonOuterClass.PropChangeReason getReason() {
            final PropChangeReasonOuterClass.PropChangeReason result = PropChangeReasonOuterClass.PropChangeReason.valueOf(this.reason_);
            return (result == null) ? PropChangeReasonOuterClass.PropChangeReason.UNRECOGNIZED : result;
        }
        
        @Override
        public int getEntityId() {
            return this.entityId_;
        }
        
        @Override
        public int getChangeEnergyResonValue() {
            return this.changeEnergyReson_;
        }
        
        @Override
        public ChangeEnergyReasonOuterClass.ChangeEnergyReason getChangeEnergyReson() {
            final ChangeEnergyReasonOuterClass.ChangeEnergyReason result = ChangeEnergyReasonOuterClass.ChangeEnergyReason.valueOf(this.changeEnergyReson_);
            return (result == null) ? ChangeEnergyReasonOuterClass.ChangeEnergyReason.UNRECOGNIZED : result;
        }
        
        @Override
        public int getPropType() {
            return this.propType_;
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
            if (this.propType_ != 0) {
                output.writeUInt32(3, this.propType_);
            }
            if (this.reason_ != PropChangeReasonOuterClass.PropChangeReason.PROP_CHANGE_REASON_NONE.getNumber()) {
                output.writeEnum(7, this.reason_);
            }
            if (this.changeEnergyReson_ != ChangeEnergyReasonOuterClass.ChangeEnergyReason.CHANGE_ENERGY_REASON_NONE.getNumber()) {
                output.writeEnum(9, this.changeEnergyReson_);
            }
            if (this.getParamListList().size() > 0) {
                output.writeUInt32NoTag(82);
                output.writeUInt32NoTag(this.paramListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.paramList_.size(); ++i) {
                output.writeUInt32NoTag(this.paramList_.getInt(i));
            }
            if (this.changeHpReason_ != ChangeHpReasonOuterClass.ChangeHpReason.CHANGE_HP_REASON_NONE.getNumber()) {
                output.writeEnum(12, this.changeHpReason_);
            }
            if (this.propDelta_ != 0.0f) {
                output.writeFloat(13, this.propDelta_);
            }
            if (this.entityId_ != 0) {
                output.writeUInt32(14, this.entityId_);
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
            if (this.propType_ != 0) {
                size += CodedOutputStream.computeUInt32Size(3, this.propType_);
            }
            if (this.reason_ != PropChangeReasonOuterClass.PropChangeReason.PROP_CHANGE_REASON_NONE.getNumber()) {
                size += CodedOutputStream.computeEnumSize(7, this.reason_);
            }
            if (this.changeEnergyReson_ != ChangeEnergyReasonOuterClass.ChangeEnergyReason.CHANGE_ENERGY_REASON_NONE.getNumber()) {
                size += CodedOutputStream.computeEnumSize(9, this.changeEnergyReson_);
            }
            int dataSize = 0;
            for (int i = 0; i < this.paramList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.paramList_.getInt(i));
            }
            size += dataSize;
            if (!this.getParamListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.paramListMemoizedSerializedSize = dataSize;
            if (this.changeHpReason_ != ChangeHpReasonOuterClass.ChangeHpReason.CHANGE_HP_REASON_NONE.getNumber()) {
                size += CodedOutputStream.computeEnumSize(12, this.changeHpReason_);
            }
            if (this.propDelta_ != 0.0f) {
                size += CodedOutputStream.computeFloatSize(13, this.propDelta_);
            }
            if (this.entityId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(14, this.entityId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EntityFightPropChangeReasonNotify)) {
                return super.equals(obj);
            }
            final EntityFightPropChangeReasonNotify other = (EntityFightPropChangeReasonNotify)obj;
            return this.getParamListList().equals(other.getParamListList()) && Float.floatToIntBits(this.getPropDelta()) == Float.floatToIntBits(other.getPropDelta()) && this.changeHpReason_ == other.changeHpReason_ && this.reason_ == other.reason_ && this.getEntityId() == other.getEntityId() && this.changeEnergyReson_ == other.changeEnergyReson_ && this.getPropType() == other.getPropType() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getParamListCount() > 0) {
                hash = 37 * hash + 10;
                hash = 53 * hash + this.getParamListList().hashCode();
            }
            hash = 37 * hash + 13;
            hash = 53 * hash + Float.floatToIntBits(this.getPropDelta());
            hash = 37 * hash + 12;
            hash = 53 * hash + this.changeHpReason_;
            hash = 37 * hash + 7;
            hash = 53 * hash + this.reason_;
            hash = 37 * hash + 14;
            hash = 53 * hash + this.getEntityId();
            hash = 37 * hash + 9;
            hash = 53 * hash + this.changeEnergyReson_;
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getPropType();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static EntityFightPropChangeReasonNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return EntityFightPropChangeReasonNotify.PARSER.parseFrom(data);
        }
        
        public static EntityFightPropChangeReasonNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return EntityFightPropChangeReasonNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static EntityFightPropChangeReasonNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return EntityFightPropChangeReasonNotify.PARSER.parseFrom(data);
        }
        
        public static EntityFightPropChangeReasonNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return EntityFightPropChangeReasonNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static EntityFightPropChangeReasonNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return EntityFightPropChangeReasonNotify.PARSER.parseFrom(data);
        }
        
        public static EntityFightPropChangeReasonNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return EntityFightPropChangeReasonNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static EntityFightPropChangeReasonNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EntityFightPropChangeReasonNotify.PARSER, input);
        }
        
        public static EntityFightPropChangeReasonNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EntityFightPropChangeReasonNotify.PARSER, input, extensionRegistry);
        }
        
        public static EntityFightPropChangeReasonNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(EntityFightPropChangeReasonNotify.PARSER, input);
        }
        
        public static EntityFightPropChangeReasonNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(EntityFightPropChangeReasonNotify.PARSER, input, extensionRegistry);
        }
        
        public static EntityFightPropChangeReasonNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EntityFightPropChangeReasonNotify.PARSER, input);
        }
        
        public static EntityFightPropChangeReasonNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EntityFightPropChangeReasonNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return EntityFightPropChangeReasonNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final EntityFightPropChangeReasonNotify prototype) {
            return EntityFightPropChangeReasonNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == EntityFightPropChangeReasonNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static EntityFightPropChangeReasonNotify getDefaultInstance() {
            return EntityFightPropChangeReasonNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<EntityFightPropChangeReasonNotify> parser() {
            return EntityFightPropChangeReasonNotify.PARSER;
        }
        
        @Override
        public Parser<EntityFightPropChangeReasonNotify> getParserForType() {
            return EntityFightPropChangeReasonNotify.PARSER;
        }
        
        @Override
        public EntityFightPropChangeReasonNotify getDefaultInstanceForType() {
            return EntityFightPropChangeReasonNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new EntityFightPropChangeReasonNotify();
            PARSER = new AbstractParser<EntityFightPropChangeReasonNotify>() {
                @Override
                public EntityFightPropChangeReasonNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new EntityFightPropChangeReasonNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EntityFightPropChangeReasonNotifyOrBuilder
        {
            private int bitField0_;
            private Internal.IntList paramList_;
            private float propDelta_;
            private int changeHpReason_;
            private int reason_;
            private int entityId_;
            private int changeEnergyReson_;
            private int propType_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return EntityFightPropChangeReasonNotifyOuterClass.internal_static_EntityFightPropChangeReasonNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return EntityFightPropChangeReasonNotifyOuterClass.internal_static_EntityFightPropChangeReasonNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(EntityFightPropChangeReasonNotify.class, Builder.class);
            }
            
            private Builder() {
                this.paramList_ = GeneratedMessageV3.emptyIntList();
                this.changeHpReason_ = 0;
                this.reason_ = 0;
                this.changeEnergyReson_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.paramList_ = GeneratedMessageV3.emptyIntList();
                this.changeHpReason_ = 0;
                this.reason_ = 0;
                this.changeEnergyReson_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (EntityFightPropChangeReasonNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.paramList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.propDelta_ = 0.0f;
                this.changeHpReason_ = 0;
                this.reason_ = 0;
                this.entityId_ = 0;
                this.changeEnergyReson_ = 0;
                this.propType_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return EntityFightPropChangeReasonNotifyOuterClass.internal_static_EntityFightPropChangeReasonNotify_descriptor;
            }
            
            @Override
            public EntityFightPropChangeReasonNotify getDefaultInstanceForType() {
                return EntityFightPropChangeReasonNotify.getDefaultInstance();
            }
            
            @Override
            public EntityFightPropChangeReasonNotify build() {
                final EntityFightPropChangeReasonNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public EntityFightPropChangeReasonNotify buildPartial() {
                final EntityFightPropChangeReasonNotify result = new EntityFightPropChangeReasonNotify(this);
                final int from_bitField0_ = this.bitField0_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.paramList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.paramList_ = this.paramList_;
                result.propDelta_ = this.propDelta_;
                result.changeHpReason_ = this.changeHpReason_;
                result.reason_ = this.reason_;
                result.entityId_ = this.entityId_;
                result.changeEnergyReson_ = this.changeEnergyReson_;
                result.propType_ = this.propType_;
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
                if (other instanceof EntityFightPropChangeReasonNotify) {
                    return this.mergeFrom((EntityFightPropChangeReasonNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final EntityFightPropChangeReasonNotify other) {
                if (other == EntityFightPropChangeReasonNotify.getDefaultInstance()) {
                    return this;
                }
                if (!other.paramList_.isEmpty()) {
                    if (this.paramList_.isEmpty()) {
                        this.paramList_ = other.paramList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureParamListIsMutable();
                        this.paramList_.addAll(other.paramList_);
                    }
                    this.onChanged();
                }
                if (other.getPropDelta() != 0.0f) {
                    this.setPropDelta(other.getPropDelta());
                }
                if (other.changeHpReason_ != 0) {
                    this.setChangeHpReasonValue(other.getChangeHpReasonValue());
                }
                if (other.reason_ != 0) {
                    this.setReasonValue(other.getReasonValue());
                }
                if (other.getEntityId() != 0) {
                    this.setEntityId(other.getEntityId());
                }
                if (other.changeEnergyReson_ != 0) {
                    this.setChangeEnergyResonValue(other.getChangeEnergyResonValue());
                }
                if (other.getPropType() != 0) {
                    this.setPropType(other.getPropType());
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
                EntityFightPropChangeReasonNotify parsedMessage = null;
                try {
                    parsedMessage = EntityFightPropChangeReasonNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (EntityFightPropChangeReasonNotify)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureParamListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.paramList_ = GeneratedMessageV3.mutableCopy(this.paramList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getParamListList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.paramList_) : this.paramList_;
            }
            
            @Override
            public int getParamListCount() {
                return this.paramList_.size();
            }
            
            @Override
            public int getParamList(final int index) {
                return this.paramList_.getInt(index);
            }
            
            public Builder setParamList(final int index, final int value) {
                this.ensureParamListIsMutable();
                this.paramList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addParamList(final int value) {
                this.ensureParamListIsMutable();
                this.paramList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllParamList(final Iterable<? extends Integer> values) {
                this.ensureParamListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.paramList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearParamList() {
                this.paramList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.onChanged();
                return this;
            }
            
            @Override
            public float getPropDelta() {
                return this.propDelta_;
            }
            
            public Builder setPropDelta(final float value) {
                this.propDelta_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearPropDelta() {
                this.propDelta_ = 0.0f;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getChangeHpReasonValue() {
                return this.changeHpReason_;
            }
            
            public Builder setChangeHpReasonValue(final int value) {
                this.changeHpReason_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public ChangeHpReasonOuterClass.ChangeHpReason getChangeHpReason() {
                final ChangeHpReasonOuterClass.ChangeHpReason result = ChangeHpReasonOuterClass.ChangeHpReason.valueOf(this.changeHpReason_);
                return (result == null) ? ChangeHpReasonOuterClass.ChangeHpReason.UNRECOGNIZED : result;
            }
            
            public Builder setChangeHpReason(final ChangeHpReasonOuterClass.ChangeHpReason value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.changeHpReason_ = value.getNumber();
                this.onChanged();
                return this;
            }
            
            public Builder clearChangeHpReason() {
                this.changeHpReason_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getReasonValue() {
                return this.reason_;
            }
            
            public Builder setReasonValue(final int value) {
                this.reason_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public PropChangeReasonOuterClass.PropChangeReason getReason() {
                final PropChangeReasonOuterClass.PropChangeReason result = PropChangeReasonOuterClass.PropChangeReason.valueOf(this.reason_);
                return (result == null) ? PropChangeReasonOuterClass.PropChangeReason.UNRECOGNIZED : result;
            }
            
            public Builder setReason(final PropChangeReasonOuterClass.PropChangeReason value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.reason_ = value.getNumber();
                this.onChanged();
                return this;
            }
            
            public Builder clearReason() {
                this.reason_ = 0;
                this.onChanged();
                return this;
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
            public int getChangeEnergyResonValue() {
                return this.changeEnergyReson_;
            }
            
            public Builder setChangeEnergyResonValue(final int value) {
                this.changeEnergyReson_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public ChangeEnergyReasonOuterClass.ChangeEnergyReason getChangeEnergyReson() {
                final ChangeEnergyReasonOuterClass.ChangeEnergyReason result = ChangeEnergyReasonOuterClass.ChangeEnergyReason.valueOf(this.changeEnergyReson_);
                return (result == null) ? ChangeEnergyReasonOuterClass.ChangeEnergyReason.UNRECOGNIZED : result;
            }
            
            public Builder setChangeEnergyReson(final ChangeEnergyReasonOuterClass.ChangeEnergyReason value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.changeEnergyReson_ = value.getNumber();
                this.onChanged();
                return this;
            }
            
            public Builder clearChangeEnergyReson() {
                this.changeEnergyReson_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getPropType() {
                return this.propType_;
            }
            
            public Builder setPropType(final int value) {
                this.propType_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearPropType() {
                this.propType_ = 0;
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
    
    public interface EntityFightPropChangeReasonNotifyOrBuilder extends MessageOrBuilder
    {
        List<Integer> getParamListList();
        
        int getParamListCount();
        
        int getParamList(final int p0);
        
        float getPropDelta();
        
        int getChangeHpReasonValue();
        
        ChangeHpReasonOuterClass.ChangeHpReason getChangeHpReason();
        
        int getReasonValue();
        
        PropChangeReasonOuterClass.PropChangeReason getReason();
        
        int getEntityId();
        
        int getChangeEnergyResonValue();
        
        ChangeEnergyReasonOuterClass.ChangeEnergyReason getChangeEnergyReson();
        
        int getPropType();
    }
}
