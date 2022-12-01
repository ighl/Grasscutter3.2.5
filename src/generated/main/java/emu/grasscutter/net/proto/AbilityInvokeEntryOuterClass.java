// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Internal;
import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.ByteString;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class AbilityInvokeEntryOuterClass
{
    private static final Descriptors.Descriptor internal_static_AbilityInvokeEntry_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AbilityInvokeEntry_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private AbilityInvokeEntryOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return AbilityInvokeEntryOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0018AbilityInvokeEntry.proto\u001a\u001bAbilityInvokeArgument.proto\u001a\u001cAbilityInvokeEntryHead.proto\u001a\u0011ForwardType.proto\"\u008d\u0002\n\u0012AbilityInvokeEntry\u0012\u0011\n\tentity_id\u0018\b \u0001(\r\u0012\u0017\n\u000ftotal_tick_time\u0018\u000b \u0001(\u0001\u0012\u0010\n\bevent_id\u0018\u0004 \u0001(\r\u0012\u0014\n\fability_data\u0018\u000e \u0001(\f\u0012-\n\rargument_type\u0018\u0006 \u0001(\u000e2\u0016.AbilityInvokeArgument\u0012%\n\u0004head\u0018\u0007 \u0001(\u000b2\u0017.AbilityInvokeEntryHead\u0012\u0014\n\fforward_peer\u0018\u0001 \u0001(\r\u0012\"\n\fforward_type\u0018\u0005 \u0001(\u000e2\f.ForwardType\u0012\u0013\n\u000bPPLBBIAOPAA\u0018\u0003 \u0001(\bB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        AbilityInvokeEntryOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { AbilityInvokeArgumentOuterClass.getDescriptor(), AbilityInvokeEntryHeadOuterClass.getDescriptor(), ForwardTypeOuterClass.getDescriptor() });
        internal_static_AbilityInvokeEntry_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_AbilityInvokeEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(AbilityInvokeEntryOuterClass.internal_static_AbilityInvokeEntry_descriptor, new String[] { "EntityId", "TotalTickTime", "EventId", "AbilityData", "ArgumentType", "Head", "ForwardPeer", "ForwardType", "PPLBBIAOPAA" });
        AbilityInvokeArgumentOuterClass.getDescriptor();
        AbilityInvokeEntryHeadOuterClass.getDescriptor();
        ForwardTypeOuterClass.getDescriptor();
    }
    
    public static final class AbilityInvokeEntry extends GeneratedMessageV3 implements AbilityInvokeEntryOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int ENTITY_ID_FIELD_NUMBER = 8;
        private int entityId_;
        public static final int TOTAL_TICK_TIME_FIELD_NUMBER = 11;
        private double totalTickTime_;
        public static final int EVENT_ID_FIELD_NUMBER = 4;
        private int eventId_;
        public static final int ABILITY_DATA_FIELD_NUMBER = 14;
        private ByteString abilityData_;
        public static final int ARGUMENT_TYPE_FIELD_NUMBER = 6;
        private int argumentType_;
        public static final int HEAD_FIELD_NUMBER = 7;
        private AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead head_;
        public static final int FORWARD_PEER_FIELD_NUMBER = 1;
        private int forwardPeer_;
        public static final int FORWARD_TYPE_FIELD_NUMBER = 5;
        private int forwardType_;
        public static final int PPLBBIAOPAA_FIELD_NUMBER = 3;
        private boolean pPLBBIAOPAA_;
        private byte memoizedIsInitialized;
        private static final AbilityInvokeEntry DEFAULT_INSTANCE;
        private static final Parser<AbilityInvokeEntry> PARSER;
        
        private AbilityInvokeEntry(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private AbilityInvokeEntry() {
            this.memoizedIsInitialized = -1;
            this.abilityData_ = ByteString.EMPTY;
            this.argumentType_ = 0;
            this.forwardType_ = 0;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new AbilityInvokeEntry();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private AbilityInvokeEntry(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
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
                            this.forwardPeer_ = input.readUInt32();
                            continue;
                        }
                        case 24: {
                            this.pPLBBIAOPAA_ = input.readBool();
                            continue;
                        }
                        case 32: {
                            this.eventId_ = input.readUInt32();
                            continue;
                        }
                        case 40: {
                            final int rawValue = input.readEnum();
                            this.forwardType_ = rawValue;
                            continue;
                        }
                        case 48: {
                            final int rawValue = input.readEnum();
                            this.argumentType_ = rawValue;
                            continue;
                        }
                        case 58: {
                            AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead.Builder subBuilder = null;
                            if (this.head_ != null) {
                                subBuilder = this.head_.toBuilder();
                            }
                            this.head_ = input.readMessage(AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.head_);
                                this.head_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 64: {
                            this.entityId_ = input.readUInt32();
                            continue;
                        }
                        case 89: {
                            this.totalTickTime_ = input.readDouble();
                            continue;
                        }
                        case 114: {
                            this.abilityData_ = input.readBytes();
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
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return AbilityInvokeEntryOuterClass.internal_static_AbilityInvokeEntry_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return AbilityInvokeEntryOuterClass.internal_static_AbilityInvokeEntry_fieldAccessorTable.ensureFieldAccessorsInitialized(AbilityInvokeEntry.class, Builder.class);
        }
        
        @Override
        public int getEntityId() {
            return this.entityId_;
        }
        
        @Override
        public double getTotalTickTime() {
            return this.totalTickTime_;
        }
        
        @Override
        public int getEventId() {
            return this.eventId_;
        }
        
        @Override
        public ByteString getAbilityData() {
            return this.abilityData_;
        }
        
        @Override
        public int getArgumentTypeValue() {
            return this.argumentType_;
        }
        
        @Override
        public AbilityInvokeArgumentOuterClass.AbilityInvokeArgument getArgumentType() {
            final AbilityInvokeArgumentOuterClass.AbilityInvokeArgument result = AbilityInvokeArgumentOuterClass.AbilityInvokeArgument.valueOf(this.argumentType_);
            return (result == null) ? AbilityInvokeArgumentOuterClass.AbilityInvokeArgument.UNRECOGNIZED : result;
        }
        
        @Override
        public boolean hasHead() {
            return this.head_ != null;
        }
        
        @Override
        public AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead getHead() {
            return (this.head_ == null) ? AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead.getDefaultInstance() : this.head_;
        }
        
        @Override
        public AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHeadOrBuilder getHeadOrBuilder() {
            return this.getHead();
        }
        
        @Override
        public int getForwardPeer() {
            return this.forwardPeer_;
        }
        
        @Override
        public int getForwardTypeValue() {
            return this.forwardType_;
        }
        
        @Override
        public ForwardTypeOuterClass.ForwardType getForwardType() {
            final ForwardTypeOuterClass.ForwardType result = ForwardTypeOuterClass.ForwardType.valueOf(this.forwardType_);
            return (result == null) ? ForwardTypeOuterClass.ForwardType.UNRECOGNIZED : result;
        }
        
        @Override
        public boolean getPPLBBIAOPAA() {
            return this.pPLBBIAOPAA_;
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
            if (this.forwardPeer_ != 0) {
                output.writeUInt32(1, this.forwardPeer_);
            }
            if (this.pPLBBIAOPAA_) {
                output.writeBool(3, this.pPLBBIAOPAA_);
            }
            if (this.eventId_ != 0) {
                output.writeUInt32(4, this.eventId_);
            }
            if (this.forwardType_ != ForwardTypeOuterClass.ForwardType.FORWARD_TYPE_LOCAL.getNumber()) {
                output.writeEnum(5, this.forwardType_);
            }
            if (this.argumentType_ != AbilityInvokeArgumentOuterClass.AbilityInvokeArgument.ABILITY_INVOKE_ARGUMENT_NONE.getNumber()) {
                output.writeEnum(6, this.argumentType_);
            }
            if (this.head_ != null) {
                output.writeMessage(7, this.getHead());
            }
            if (this.entityId_ != 0) {
                output.writeUInt32(8, this.entityId_);
            }
            if (this.totalTickTime_ != 0.0) {
                output.writeDouble(11, this.totalTickTime_);
            }
            if (!this.abilityData_.isEmpty()) {
                output.writeBytes(14, this.abilityData_);
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
            if (this.forwardPeer_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.forwardPeer_);
            }
            if (this.pPLBBIAOPAA_) {
                size += CodedOutputStream.computeBoolSize(3, this.pPLBBIAOPAA_);
            }
            if (this.eventId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(4, this.eventId_);
            }
            if (this.forwardType_ != ForwardTypeOuterClass.ForwardType.FORWARD_TYPE_LOCAL.getNumber()) {
                size += CodedOutputStream.computeEnumSize(5, this.forwardType_);
            }
            if (this.argumentType_ != AbilityInvokeArgumentOuterClass.AbilityInvokeArgument.ABILITY_INVOKE_ARGUMENT_NONE.getNumber()) {
                size += CodedOutputStream.computeEnumSize(6, this.argumentType_);
            }
            if (this.head_ != null) {
                size += CodedOutputStream.computeMessageSize(7, this.getHead());
            }
            if (this.entityId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(8, this.entityId_);
            }
            if (this.totalTickTime_ != 0.0) {
                size += CodedOutputStream.computeDoubleSize(11, this.totalTickTime_);
            }
            if (!this.abilityData_.isEmpty()) {
                size += CodedOutputStream.computeBytesSize(14, this.abilityData_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbilityInvokeEntry)) {
                return super.equals(obj);
            }
            final AbilityInvokeEntry other = (AbilityInvokeEntry)obj;
            return this.getEntityId() == other.getEntityId() && Double.doubleToLongBits(this.getTotalTickTime()) == Double.doubleToLongBits(other.getTotalTickTime()) && this.getEventId() == other.getEventId() && this.getAbilityData().equals(other.getAbilityData()) && this.argumentType_ == other.argumentType_ && this.hasHead() == other.hasHead() && (!this.hasHead() || this.getHead().equals(other.getHead())) && this.getForwardPeer() == other.getForwardPeer() && this.forwardType_ == other.forwardType_ && this.getPPLBBIAOPAA() == other.getPPLBBIAOPAA() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 8;
            hash = 53 * hash + this.getEntityId();
            hash = 37 * hash + 11;
            hash = 53 * hash + Internal.hashLong(Double.doubleToLongBits(this.getTotalTickTime()));
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getEventId();
            hash = 37 * hash + 14;
            hash = 53 * hash + this.getAbilityData().hashCode();
            hash = 37 * hash + 6;
            hash = 53 * hash + this.argumentType_;
            if (this.hasHead()) {
                hash = 37 * hash + 7;
                hash = 53 * hash + this.getHead().hashCode();
            }
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getForwardPeer();
            hash = 37 * hash + 5;
            hash = 53 * hash + this.forwardType_;
            hash = 37 * hash + 3;
            hash = 53 * hash + Internal.hashBoolean(this.getPPLBBIAOPAA());
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static AbilityInvokeEntry parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return AbilityInvokeEntry.PARSER.parseFrom(data);
        }
        
        public static AbilityInvokeEntry parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AbilityInvokeEntry.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AbilityInvokeEntry parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return AbilityInvokeEntry.PARSER.parseFrom(data);
        }
        
        public static AbilityInvokeEntry parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AbilityInvokeEntry.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AbilityInvokeEntry parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return AbilityInvokeEntry.PARSER.parseFrom(data);
        }
        
        public static AbilityInvokeEntry parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AbilityInvokeEntry.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AbilityInvokeEntry parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AbilityInvokeEntry.PARSER, input);
        }
        
        public static AbilityInvokeEntry parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AbilityInvokeEntry.PARSER, input, extensionRegistry);
        }
        
        public static AbilityInvokeEntry parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AbilityInvokeEntry.PARSER, input);
        }
        
        public static AbilityInvokeEntry parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AbilityInvokeEntry.PARSER, input, extensionRegistry);
        }
        
        public static AbilityInvokeEntry parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AbilityInvokeEntry.PARSER, input);
        }
        
        public static AbilityInvokeEntry parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AbilityInvokeEntry.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return AbilityInvokeEntry.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final AbilityInvokeEntry prototype) {
            return AbilityInvokeEntry.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == AbilityInvokeEntry.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static AbilityInvokeEntry getDefaultInstance() {
            return AbilityInvokeEntry.DEFAULT_INSTANCE;
        }
        
        public static Parser<AbilityInvokeEntry> parser() {
            return AbilityInvokeEntry.PARSER;
        }
        
        @Override
        public Parser<AbilityInvokeEntry> getParserForType() {
            return AbilityInvokeEntry.PARSER;
        }
        
        @Override
        public AbilityInvokeEntry getDefaultInstanceForType() {
            return AbilityInvokeEntry.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new AbilityInvokeEntry();
            PARSER = new AbstractParser<AbilityInvokeEntry>() {
                @Override
                public AbilityInvokeEntry parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new AbilityInvokeEntry(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AbilityInvokeEntryOrBuilder
        {
            private int entityId_;
            private double totalTickTime_;
            private int eventId_;
            private ByteString abilityData_;
            private int argumentType_;
            private AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead head_;
            private SingleFieldBuilderV3<AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead, AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead.Builder, AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHeadOrBuilder> headBuilder_;
            private int forwardPeer_;
            private int forwardType_;
            private boolean pPLBBIAOPAA_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return AbilityInvokeEntryOuterClass.internal_static_AbilityInvokeEntry_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return AbilityInvokeEntryOuterClass.internal_static_AbilityInvokeEntry_fieldAccessorTable.ensureFieldAccessorsInitialized(AbilityInvokeEntry.class, Builder.class);
            }
            
            private Builder() {
                this.abilityData_ = ByteString.EMPTY;
                this.argumentType_ = 0;
                this.forwardType_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.abilityData_ = ByteString.EMPTY;
                this.argumentType_ = 0;
                this.forwardType_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (AbilityInvokeEntry.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.entityId_ = 0;
                this.totalTickTime_ = 0.0;
                this.eventId_ = 0;
                this.abilityData_ = ByteString.EMPTY;
                this.argumentType_ = 0;
                if (this.headBuilder_ == null) {
                    this.head_ = null;
                }
                else {
                    this.head_ = null;
                    this.headBuilder_ = null;
                }
                this.forwardPeer_ = 0;
                this.forwardType_ = 0;
                this.pPLBBIAOPAA_ = false;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return AbilityInvokeEntryOuterClass.internal_static_AbilityInvokeEntry_descriptor;
            }
            
            @Override
            public AbilityInvokeEntry getDefaultInstanceForType() {
                return AbilityInvokeEntry.getDefaultInstance();
            }
            
            @Override
            public AbilityInvokeEntry build() {
                final AbilityInvokeEntry result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public AbilityInvokeEntry buildPartial() {
                final AbilityInvokeEntry result = new AbilityInvokeEntry(this);
                result.entityId_ = this.entityId_;
                result.totalTickTime_ = this.totalTickTime_;
                result.eventId_ = this.eventId_;
                result.abilityData_ = this.abilityData_;
                result.argumentType_ = this.argumentType_;
                if (this.headBuilder_ == null) {
                    result.head_ = this.head_;
                }
                else {
                    result.head_ = this.headBuilder_.build();
                }
                result.forwardPeer_ = this.forwardPeer_;
                result.forwardType_ = this.forwardType_;
                result.pPLBBIAOPAA_ = this.pPLBBIAOPAA_;
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
                if (other instanceof AbilityInvokeEntry) {
                    return this.mergeFrom((AbilityInvokeEntry)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final AbilityInvokeEntry other) {
                if (other == AbilityInvokeEntry.getDefaultInstance()) {
                    return this;
                }
                if (other.getEntityId() != 0) {
                    this.setEntityId(other.getEntityId());
                }
                if (other.getTotalTickTime() != 0.0) {
                    this.setTotalTickTime(other.getTotalTickTime());
                }
                if (other.getEventId() != 0) {
                    this.setEventId(other.getEventId());
                }
                if (other.getAbilityData() != ByteString.EMPTY) {
                    this.setAbilityData(other.getAbilityData());
                }
                if (other.argumentType_ != 0) {
                    this.setArgumentTypeValue(other.getArgumentTypeValue());
                }
                if (other.hasHead()) {
                    this.mergeHead(other.getHead());
                }
                if (other.getForwardPeer() != 0) {
                    this.setForwardPeer(other.getForwardPeer());
                }
                if (other.forwardType_ != 0) {
                    this.setForwardTypeValue(other.getForwardTypeValue());
                }
                if (other.getPPLBBIAOPAA()) {
                    this.setPPLBBIAOPAA(other.getPPLBBIAOPAA());
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
                AbilityInvokeEntry parsedMessage = null;
                try {
                    parsedMessage = AbilityInvokeEntry.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (AbilityInvokeEntry)e.getUnfinishedMessage();
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
            public double getTotalTickTime() {
                return this.totalTickTime_;
            }
            
            public Builder setTotalTickTime(final double value) {
                this.totalTickTime_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearTotalTickTime() {
                this.totalTickTime_ = 0.0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getEventId() {
                return this.eventId_;
            }
            
            public Builder setEventId(final int value) {
                this.eventId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearEventId() {
                this.eventId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public ByteString getAbilityData() {
                return this.abilityData_;
            }
            
            public Builder setAbilityData(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.abilityData_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearAbilityData() {
                this.abilityData_ = AbilityInvokeEntry.getDefaultInstance().getAbilityData();
                this.onChanged();
                return this;
            }
            
            @Override
            public int getArgumentTypeValue() {
                return this.argumentType_;
            }
            
            public Builder setArgumentTypeValue(final int value) {
                this.argumentType_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public AbilityInvokeArgumentOuterClass.AbilityInvokeArgument getArgumentType() {
                final AbilityInvokeArgumentOuterClass.AbilityInvokeArgument result = AbilityInvokeArgumentOuterClass.AbilityInvokeArgument.valueOf(this.argumentType_);
                return (result == null) ? AbilityInvokeArgumentOuterClass.AbilityInvokeArgument.UNRECOGNIZED : result;
            }
            
            public Builder setArgumentType(final AbilityInvokeArgumentOuterClass.AbilityInvokeArgument value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.argumentType_ = value.getNumber();
                this.onChanged();
                return this;
            }
            
            public Builder clearArgumentType() {
                this.argumentType_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasHead() {
                return this.headBuilder_ != null || this.head_ != null;
            }
            
            @Override
            public AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead getHead() {
                if (this.headBuilder_ == null) {
                    return (this.head_ == null) ? AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead.getDefaultInstance() : this.head_;
                }
                return this.headBuilder_.getMessage();
            }
            
            public Builder setHead(final AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead value) {
                if (this.headBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.head_ = value;
                    this.onChanged();
                }
                else {
                    this.headBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setHead(final AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead.Builder builderForValue) {
                if (this.headBuilder_ == null) {
                    this.head_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.headBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeHead(final AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead value) {
                if (this.headBuilder_ == null) {
                    if (this.head_ != null) {
                        this.head_ = AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead.newBuilder(this.head_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.head_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.headBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearHead() {
                if (this.headBuilder_ == null) {
                    this.head_ = null;
                    this.onChanged();
                }
                else {
                    this.head_ = null;
                    this.headBuilder_ = null;
                }
                return this;
            }
            
            public AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead.Builder getHeadBuilder() {
                this.onChanged();
                return this.getHeadFieldBuilder().getBuilder();
            }
            
            @Override
            public AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHeadOrBuilder getHeadOrBuilder() {
                if (this.headBuilder_ != null) {
                    return this.headBuilder_.getMessageOrBuilder();
                }
                return (this.head_ == null) ? AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead.getDefaultInstance() : this.head_;
            }
            
            private SingleFieldBuilderV3<AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead, AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead.Builder, AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHeadOrBuilder> getHeadFieldBuilder() {
                if (this.headBuilder_ == null) {
                    this.headBuilder_ = new SingleFieldBuilderV3<AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead, AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead.Builder, AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHeadOrBuilder>(this.getHead(), this.getParentForChildren(), this.isClean());
                    this.head_ = null;
                }
                return this.headBuilder_;
            }
            
            @Override
            public int getForwardPeer() {
                return this.forwardPeer_;
            }
            
            public Builder setForwardPeer(final int value) {
                this.forwardPeer_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearForwardPeer() {
                this.forwardPeer_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getForwardTypeValue() {
                return this.forwardType_;
            }
            
            public Builder setForwardTypeValue(final int value) {
                this.forwardType_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public ForwardTypeOuterClass.ForwardType getForwardType() {
                final ForwardTypeOuterClass.ForwardType result = ForwardTypeOuterClass.ForwardType.valueOf(this.forwardType_);
                return (result == null) ? ForwardTypeOuterClass.ForwardType.UNRECOGNIZED : result;
            }
            
            public Builder setForwardType(final ForwardTypeOuterClass.ForwardType value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.forwardType_ = value.getNumber();
                this.onChanged();
                return this;
            }
            
            public Builder clearForwardType() {
                this.forwardType_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getPPLBBIAOPAA() {
                return this.pPLBBIAOPAA_;
            }
            
            public Builder setPPLBBIAOPAA(final boolean value) {
                this.pPLBBIAOPAA_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearPPLBBIAOPAA() {
                this.pPLBBIAOPAA_ = false;
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
    
    public interface AbilityInvokeEntryOrBuilder extends MessageOrBuilder
    {
        int getEntityId();
        
        double getTotalTickTime();
        
        int getEventId();
        
        ByteString getAbilityData();
        
        int getArgumentTypeValue();
        
        AbilityInvokeArgumentOuterClass.AbilityInvokeArgument getArgumentType();
        
        boolean hasHead();
        
        AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead getHead();
        
        AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHeadOrBuilder getHeadOrBuilder();
        
        int getForwardPeer();
        
        int getForwardTypeValue();
        
        ForwardTypeOuterClass.ForwardType getForwardType();
        
        boolean getPPLBBIAOPAA();
    }
}
