// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
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
import java.util.List;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class AbilityAppliedAbilityOuterClass
{
    private static final Descriptors.Descriptor internal_static_AbilityAppliedAbility_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AbilityAppliedAbility_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private AbilityAppliedAbilityOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return AbilityAppliedAbilityOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001bAbilityAppliedAbility.proto\u001a\u001dAbilityScalarValueEntry.proto\u001a\u0013AbilityString.proto\"µ\u0001\n\u0015AbilityAppliedAbility\u0012$\n\fability_name\u0018\u0001 \u0001(\u000b2\u000e.AbilityString\u0012(\n\u0010ability_override\u0018\u0002 \u0001(\u000b2\u000e.AbilityString\u0012.\n\foverride_map\u0018\u0003 \u0003(\u000b2\u0018.AbilityScalarValueEntry\u0012\u001c\n\u0014instanced_ability_id\u0018\u0004 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        AbilityAppliedAbilityOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { AbilityScalarValueEntryOuterClass.getDescriptor(), AbilityStringOuterClass.getDescriptor() });
        internal_static_AbilityAppliedAbility_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_AbilityAppliedAbility_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(AbilityAppliedAbilityOuterClass.internal_static_AbilityAppliedAbility_descriptor, new String[] { "AbilityName", "AbilityOverride", "OverrideMap", "InstancedAbilityId" });
        AbilityScalarValueEntryOuterClass.getDescriptor();
        AbilityStringOuterClass.getDescriptor();
    }
    
    public static final class AbilityAppliedAbility extends GeneratedMessageV3 implements AbilityAppliedAbilityOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int ABILITY_NAME_FIELD_NUMBER = 1;
        private AbilityStringOuterClass.AbilityString abilityName_;
        public static final int ABILITY_OVERRIDE_FIELD_NUMBER = 2;
        private AbilityStringOuterClass.AbilityString abilityOverride_;
        public static final int OVERRIDE_MAP_FIELD_NUMBER = 3;
        private List<AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry> overrideMap_;
        public static final int INSTANCED_ABILITY_ID_FIELD_NUMBER = 4;
        private int instancedAbilityId_;
        private byte memoizedIsInitialized;
        private static final AbilityAppliedAbility DEFAULT_INSTANCE;
        private static final Parser<AbilityAppliedAbility> PARSER;
        
        private AbilityAppliedAbility(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private AbilityAppliedAbility() {
            this.memoizedIsInitialized = -1;
            this.overrideMap_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new AbilityAppliedAbility();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private AbilityAppliedAbility(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            AbilityStringOuterClass.AbilityString.Builder subBuilder = null;
                            if (this.abilityName_ != null) {
                                subBuilder = this.abilityName_.toBuilder();
                            }
                            this.abilityName_ = input.readMessage(AbilityStringOuterClass.AbilityString.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.abilityName_);
                                this.abilityName_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 18: {
                            AbilityStringOuterClass.AbilityString.Builder subBuilder = null;
                            if (this.abilityOverride_ != null) {
                                subBuilder = this.abilityOverride_.toBuilder();
                            }
                            this.abilityOverride_ = input.readMessage(AbilityStringOuterClass.AbilityString.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.abilityOverride_);
                                this.abilityOverride_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 26: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.overrideMap_ = new ArrayList<AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.overrideMap_.add(input.readMessage(AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry.parser(), extensionRegistry));
                            continue;
                        }
                        case 32: {
                            this.instancedAbilityId_ = input.readUInt32();
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
                    this.overrideMap_ = Collections.unmodifiableList((List<? extends AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry>)this.overrideMap_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return AbilityAppliedAbilityOuterClass.internal_static_AbilityAppliedAbility_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return AbilityAppliedAbilityOuterClass.internal_static_AbilityAppliedAbility_fieldAccessorTable.ensureFieldAccessorsInitialized(AbilityAppliedAbility.class, Builder.class);
        }
        
        @Override
        public boolean hasAbilityName() {
            return this.abilityName_ != null;
        }
        
        @Override
        public AbilityStringOuterClass.AbilityString getAbilityName() {
            return (this.abilityName_ == null) ? AbilityStringOuterClass.AbilityString.getDefaultInstance() : this.abilityName_;
        }
        
        @Override
        public AbilityStringOuterClass.AbilityStringOrBuilder getAbilityNameOrBuilder() {
            return this.getAbilityName();
        }
        
        @Override
        public boolean hasAbilityOverride() {
            return this.abilityOverride_ != null;
        }
        
        @Override
        public AbilityStringOuterClass.AbilityString getAbilityOverride() {
            return (this.abilityOverride_ == null) ? AbilityStringOuterClass.AbilityString.getDefaultInstance() : this.abilityOverride_;
        }
        
        @Override
        public AbilityStringOuterClass.AbilityStringOrBuilder getAbilityOverrideOrBuilder() {
            return this.getAbilityOverride();
        }
        
        @Override
        public List<AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry> getOverrideMapList() {
            return this.overrideMap_;
        }
        
        @Override
        public List<? extends AbilityScalarValueEntryOuterClass.AbilityScalarValueEntryOrBuilder> getOverrideMapOrBuilderList() {
            return this.overrideMap_;
        }
        
        @Override
        public int getOverrideMapCount() {
            return this.overrideMap_.size();
        }
        
        @Override
        public AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry getOverrideMap(final int index) {
            return this.overrideMap_.get(index);
        }
        
        @Override
        public AbilityScalarValueEntryOuterClass.AbilityScalarValueEntryOrBuilder getOverrideMapOrBuilder(final int index) {
            return this.overrideMap_.get(index);
        }
        
        @Override
        public int getInstancedAbilityId() {
            return this.instancedAbilityId_;
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
            if (this.abilityName_ != null) {
                output.writeMessage(1, this.getAbilityName());
            }
            if (this.abilityOverride_ != null) {
                output.writeMessage(2, this.getAbilityOverride());
            }
            for (int i = 0; i < this.overrideMap_.size(); ++i) {
                output.writeMessage(3, this.overrideMap_.get(i));
            }
            if (this.instancedAbilityId_ != 0) {
                output.writeUInt32(4, this.instancedAbilityId_);
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
            if (this.abilityName_ != null) {
                size += CodedOutputStream.computeMessageSize(1, this.getAbilityName());
            }
            if (this.abilityOverride_ != null) {
                size += CodedOutputStream.computeMessageSize(2, this.getAbilityOverride());
            }
            for (int i = 0; i < this.overrideMap_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(3, this.overrideMap_.get(i));
            }
            if (this.instancedAbilityId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(4, this.instancedAbilityId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbilityAppliedAbility)) {
                return super.equals(obj);
            }
            final AbilityAppliedAbility other = (AbilityAppliedAbility)obj;
            return this.hasAbilityName() == other.hasAbilityName() && (!this.hasAbilityName() || this.getAbilityName().equals(other.getAbilityName())) && this.hasAbilityOverride() == other.hasAbilityOverride() && (!this.hasAbilityOverride() || this.getAbilityOverride().equals(other.getAbilityOverride())) && this.getOverrideMapList().equals(other.getOverrideMapList()) && this.getInstancedAbilityId() == other.getInstancedAbilityId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasAbilityName()) {
                hash = 37 * hash + 1;
                hash = 53 * hash + this.getAbilityName().hashCode();
            }
            if (this.hasAbilityOverride()) {
                hash = 37 * hash + 2;
                hash = 53 * hash + this.getAbilityOverride().hashCode();
            }
            if (this.getOverrideMapCount() > 0) {
                hash = 37 * hash + 3;
                hash = 53 * hash + this.getOverrideMapList().hashCode();
            }
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getInstancedAbilityId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static AbilityAppliedAbility parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return AbilityAppliedAbility.PARSER.parseFrom(data);
        }
        
        public static AbilityAppliedAbility parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AbilityAppliedAbility.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AbilityAppliedAbility parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return AbilityAppliedAbility.PARSER.parseFrom(data);
        }
        
        public static AbilityAppliedAbility parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AbilityAppliedAbility.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AbilityAppliedAbility parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return AbilityAppliedAbility.PARSER.parseFrom(data);
        }
        
        public static AbilityAppliedAbility parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AbilityAppliedAbility.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AbilityAppliedAbility parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AbilityAppliedAbility.PARSER, input);
        }
        
        public static AbilityAppliedAbility parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AbilityAppliedAbility.PARSER, input, extensionRegistry);
        }
        
        public static AbilityAppliedAbility parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AbilityAppliedAbility.PARSER, input);
        }
        
        public static AbilityAppliedAbility parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AbilityAppliedAbility.PARSER, input, extensionRegistry);
        }
        
        public static AbilityAppliedAbility parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AbilityAppliedAbility.PARSER, input);
        }
        
        public static AbilityAppliedAbility parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AbilityAppliedAbility.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return AbilityAppliedAbility.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final AbilityAppliedAbility prototype) {
            return AbilityAppliedAbility.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == AbilityAppliedAbility.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static AbilityAppliedAbility getDefaultInstance() {
            return AbilityAppliedAbility.DEFAULT_INSTANCE;
        }
        
        public static Parser<AbilityAppliedAbility> parser() {
            return AbilityAppliedAbility.PARSER;
        }
        
        @Override
        public Parser<AbilityAppliedAbility> getParserForType() {
            return AbilityAppliedAbility.PARSER;
        }
        
        @Override
        public AbilityAppliedAbility getDefaultInstanceForType() {
            return AbilityAppliedAbility.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new AbilityAppliedAbility();
            PARSER = new AbstractParser<AbilityAppliedAbility>() {
                @Override
                public AbilityAppliedAbility parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new AbilityAppliedAbility(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AbilityAppliedAbilityOrBuilder
        {
            private int bitField0_;
            private AbilityStringOuterClass.AbilityString abilityName_;
            private SingleFieldBuilderV3<AbilityStringOuterClass.AbilityString, AbilityStringOuterClass.AbilityString.Builder, AbilityStringOuterClass.AbilityStringOrBuilder> abilityNameBuilder_;
            private AbilityStringOuterClass.AbilityString abilityOverride_;
            private SingleFieldBuilderV3<AbilityStringOuterClass.AbilityString, AbilityStringOuterClass.AbilityString.Builder, AbilityStringOuterClass.AbilityStringOrBuilder> abilityOverrideBuilder_;
            private List<AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry> overrideMap_;
            private RepeatedFieldBuilderV3<AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry, AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry.Builder, AbilityScalarValueEntryOuterClass.AbilityScalarValueEntryOrBuilder> overrideMapBuilder_;
            private int instancedAbilityId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return AbilityAppliedAbilityOuterClass.internal_static_AbilityAppliedAbility_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return AbilityAppliedAbilityOuterClass.internal_static_AbilityAppliedAbility_fieldAccessorTable.ensureFieldAccessorsInitialized(AbilityAppliedAbility.class, Builder.class);
            }
            
            private Builder() {
                this.overrideMap_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.overrideMap_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (AbilityAppliedAbility.alwaysUseFieldBuilders) {
                    this.getOverrideMapFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.abilityNameBuilder_ == null) {
                    this.abilityName_ = null;
                }
                else {
                    this.abilityName_ = null;
                    this.abilityNameBuilder_ = null;
                }
                if (this.abilityOverrideBuilder_ == null) {
                    this.abilityOverride_ = null;
                }
                else {
                    this.abilityOverride_ = null;
                    this.abilityOverrideBuilder_ = null;
                }
                if (this.overrideMapBuilder_ == null) {
                    this.overrideMap_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.overrideMapBuilder_.clear();
                }
                this.instancedAbilityId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return AbilityAppliedAbilityOuterClass.internal_static_AbilityAppliedAbility_descriptor;
            }
            
            @Override
            public AbilityAppliedAbility getDefaultInstanceForType() {
                return AbilityAppliedAbility.getDefaultInstance();
            }
            
            @Override
            public AbilityAppliedAbility build() {
                final AbilityAppliedAbility result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public AbilityAppliedAbility buildPartial() {
                final AbilityAppliedAbility result = new AbilityAppliedAbility(this);
                final int from_bitField0_ = this.bitField0_;
                if (this.abilityNameBuilder_ == null) {
                    result.abilityName_ = this.abilityName_;
                }
                else {
                    result.abilityName_ = this.abilityNameBuilder_.build();
                }
                if (this.abilityOverrideBuilder_ == null) {
                    result.abilityOverride_ = this.abilityOverride_;
                }
                else {
                    result.abilityOverride_ = this.abilityOverrideBuilder_.build();
                }
                if (this.overrideMapBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.overrideMap_ = Collections.unmodifiableList((List<? extends AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry>)this.overrideMap_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.overrideMap_ = this.overrideMap_;
                }
                else {
                    result.overrideMap_ = this.overrideMapBuilder_.build();
                }
                result.instancedAbilityId_ = this.instancedAbilityId_;
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
                if (other instanceof AbilityAppliedAbility) {
                    return this.mergeFrom((AbilityAppliedAbility)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final AbilityAppliedAbility other) {
                if (other == AbilityAppliedAbility.getDefaultInstance()) {
                    return this;
                }
                if (other.hasAbilityName()) {
                    this.mergeAbilityName(other.getAbilityName());
                }
                if (other.hasAbilityOverride()) {
                    this.mergeAbilityOverride(other.getAbilityOverride());
                }
                if (this.overrideMapBuilder_ == null) {
                    if (!other.overrideMap_.isEmpty()) {
                        if (this.overrideMap_.isEmpty()) {
                            this.overrideMap_ = other.overrideMap_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureOverrideMapIsMutable();
                            this.overrideMap_.addAll(other.overrideMap_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.overrideMap_.isEmpty()) {
                    if (this.overrideMapBuilder_.isEmpty()) {
                        this.overrideMapBuilder_.dispose();
                        this.overrideMapBuilder_ = null;
                        this.overrideMap_ = other.overrideMap_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.overrideMapBuilder_ = (AbilityAppliedAbility.alwaysUseFieldBuilders ? this.getOverrideMapFieldBuilder() : null);
                    }
                    else {
                        this.overrideMapBuilder_.addAllMessages(other.overrideMap_);
                    }
                }
                if (other.getInstancedAbilityId() != 0) {
                    this.setInstancedAbilityId(other.getInstancedAbilityId());
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
                AbilityAppliedAbility parsedMessage = null;
                try {
                    parsedMessage = AbilityAppliedAbility.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (AbilityAppliedAbility)e.getUnfinishedMessage();
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
            public boolean hasAbilityName() {
                return this.abilityNameBuilder_ != null || this.abilityName_ != null;
            }
            
            @Override
            public AbilityStringOuterClass.AbilityString getAbilityName() {
                if (this.abilityNameBuilder_ == null) {
                    return (this.abilityName_ == null) ? AbilityStringOuterClass.AbilityString.getDefaultInstance() : this.abilityName_;
                }
                return this.abilityNameBuilder_.getMessage();
            }
            
            public Builder setAbilityName(final AbilityStringOuterClass.AbilityString value) {
                if (this.abilityNameBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.abilityName_ = value;
                    this.onChanged();
                }
                else {
                    this.abilityNameBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setAbilityName(final AbilityStringOuterClass.AbilityString.Builder builderForValue) {
                if (this.abilityNameBuilder_ == null) {
                    this.abilityName_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.abilityNameBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeAbilityName(final AbilityStringOuterClass.AbilityString value) {
                if (this.abilityNameBuilder_ == null) {
                    if (this.abilityName_ != null) {
                        this.abilityName_ = AbilityStringOuterClass.AbilityString.newBuilder(this.abilityName_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.abilityName_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.abilityNameBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearAbilityName() {
                if (this.abilityNameBuilder_ == null) {
                    this.abilityName_ = null;
                    this.onChanged();
                }
                else {
                    this.abilityName_ = null;
                    this.abilityNameBuilder_ = null;
                }
                return this;
            }
            
            public AbilityStringOuterClass.AbilityString.Builder getAbilityNameBuilder() {
                this.onChanged();
                return this.getAbilityNameFieldBuilder().getBuilder();
            }
            
            @Override
            public AbilityStringOuterClass.AbilityStringOrBuilder getAbilityNameOrBuilder() {
                if (this.abilityNameBuilder_ != null) {
                    return this.abilityNameBuilder_.getMessageOrBuilder();
                }
                return (this.abilityName_ == null) ? AbilityStringOuterClass.AbilityString.getDefaultInstance() : this.abilityName_;
            }
            
            private SingleFieldBuilderV3<AbilityStringOuterClass.AbilityString, AbilityStringOuterClass.AbilityString.Builder, AbilityStringOuterClass.AbilityStringOrBuilder> getAbilityNameFieldBuilder() {
                if (this.abilityNameBuilder_ == null) {
                    this.abilityNameBuilder_ = new SingleFieldBuilderV3<AbilityStringOuterClass.AbilityString, AbilityStringOuterClass.AbilityString.Builder, AbilityStringOuterClass.AbilityStringOrBuilder>(this.getAbilityName(), this.getParentForChildren(), this.isClean());
                    this.abilityName_ = null;
                }
                return this.abilityNameBuilder_;
            }
            
            @Override
            public boolean hasAbilityOverride() {
                return this.abilityOverrideBuilder_ != null || this.abilityOverride_ != null;
            }
            
            @Override
            public AbilityStringOuterClass.AbilityString getAbilityOverride() {
                if (this.abilityOverrideBuilder_ == null) {
                    return (this.abilityOverride_ == null) ? AbilityStringOuterClass.AbilityString.getDefaultInstance() : this.abilityOverride_;
                }
                return this.abilityOverrideBuilder_.getMessage();
            }
            
            public Builder setAbilityOverride(final AbilityStringOuterClass.AbilityString value) {
                if (this.abilityOverrideBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.abilityOverride_ = value;
                    this.onChanged();
                }
                else {
                    this.abilityOverrideBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setAbilityOverride(final AbilityStringOuterClass.AbilityString.Builder builderForValue) {
                if (this.abilityOverrideBuilder_ == null) {
                    this.abilityOverride_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.abilityOverrideBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeAbilityOverride(final AbilityStringOuterClass.AbilityString value) {
                if (this.abilityOverrideBuilder_ == null) {
                    if (this.abilityOverride_ != null) {
                        this.abilityOverride_ = AbilityStringOuterClass.AbilityString.newBuilder(this.abilityOverride_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.abilityOverride_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.abilityOverrideBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearAbilityOverride() {
                if (this.abilityOverrideBuilder_ == null) {
                    this.abilityOverride_ = null;
                    this.onChanged();
                }
                else {
                    this.abilityOverride_ = null;
                    this.abilityOverrideBuilder_ = null;
                }
                return this;
            }
            
            public AbilityStringOuterClass.AbilityString.Builder getAbilityOverrideBuilder() {
                this.onChanged();
                return this.getAbilityOverrideFieldBuilder().getBuilder();
            }
            
            @Override
            public AbilityStringOuterClass.AbilityStringOrBuilder getAbilityOverrideOrBuilder() {
                if (this.abilityOverrideBuilder_ != null) {
                    return this.abilityOverrideBuilder_.getMessageOrBuilder();
                }
                return (this.abilityOverride_ == null) ? AbilityStringOuterClass.AbilityString.getDefaultInstance() : this.abilityOverride_;
            }
            
            private SingleFieldBuilderV3<AbilityStringOuterClass.AbilityString, AbilityStringOuterClass.AbilityString.Builder, AbilityStringOuterClass.AbilityStringOrBuilder> getAbilityOverrideFieldBuilder() {
                if (this.abilityOverrideBuilder_ == null) {
                    this.abilityOverrideBuilder_ = new SingleFieldBuilderV3<AbilityStringOuterClass.AbilityString, AbilityStringOuterClass.AbilityString.Builder, AbilityStringOuterClass.AbilityStringOrBuilder>(this.getAbilityOverride(), this.getParentForChildren(), this.isClean());
                    this.abilityOverride_ = null;
                }
                return this.abilityOverrideBuilder_;
            }
            
            private void ensureOverrideMapIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.overrideMap_ = new ArrayList<AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry>(this.overrideMap_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry> getOverrideMapList() {
                if (this.overrideMapBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry>)this.overrideMap_);
                }
                return this.overrideMapBuilder_.getMessageList();
            }
            
            @Override
            public int getOverrideMapCount() {
                if (this.overrideMapBuilder_ == null) {
                    return this.overrideMap_.size();
                }
                return this.overrideMapBuilder_.getCount();
            }
            
            @Override
            public AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry getOverrideMap(final int index) {
                if (this.overrideMapBuilder_ == null) {
                    return this.overrideMap_.get(index);
                }
                return this.overrideMapBuilder_.getMessage(index);
            }
            
            public Builder setOverrideMap(final int index, final AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry value) {
                if (this.overrideMapBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureOverrideMapIsMutable();
                    this.overrideMap_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.overrideMapBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setOverrideMap(final int index, final AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry.Builder builderForValue) {
                if (this.overrideMapBuilder_ == null) {
                    this.ensureOverrideMapIsMutable();
                    this.overrideMap_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.overrideMapBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addOverrideMap(final AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry value) {
                if (this.overrideMapBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureOverrideMapIsMutable();
                    this.overrideMap_.add(value);
                    this.onChanged();
                }
                else {
                    this.overrideMapBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addOverrideMap(final int index, final AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry value) {
                if (this.overrideMapBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureOverrideMapIsMutable();
                    this.overrideMap_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.overrideMapBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addOverrideMap(final AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry.Builder builderForValue) {
                if (this.overrideMapBuilder_ == null) {
                    this.ensureOverrideMapIsMutable();
                    this.overrideMap_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.overrideMapBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addOverrideMap(final int index, final AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry.Builder builderForValue) {
                if (this.overrideMapBuilder_ == null) {
                    this.ensureOverrideMapIsMutable();
                    this.overrideMap_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.overrideMapBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllOverrideMap(final Iterable<? extends AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry> values) {
                if (this.overrideMapBuilder_ == null) {
                    this.ensureOverrideMapIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.overrideMap_);
                    this.onChanged();
                }
                else {
                    this.overrideMapBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearOverrideMap() {
                if (this.overrideMapBuilder_ == null) {
                    this.overrideMap_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.overrideMapBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeOverrideMap(final int index) {
                if (this.overrideMapBuilder_ == null) {
                    this.ensureOverrideMapIsMutable();
                    this.overrideMap_.remove(index);
                    this.onChanged();
                }
                else {
                    this.overrideMapBuilder_.remove(index);
                }
                return this;
            }
            
            public AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry.Builder getOverrideMapBuilder(final int index) {
                return this.getOverrideMapFieldBuilder().getBuilder(index);
            }
            
            @Override
            public AbilityScalarValueEntryOuterClass.AbilityScalarValueEntryOrBuilder getOverrideMapOrBuilder(final int index) {
                if (this.overrideMapBuilder_ == null) {
                    return this.overrideMap_.get(index);
                }
                return this.overrideMapBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends AbilityScalarValueEntryOuterClass.AbilityScalarValueEntryOrBuilder> getOverrideMapOrBuilderList() {
                if (this.overrideMapBuilder_ != null) {
                    return this.overrideMapBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends AbilityScalarValueEntryOuterClass.AbilityScalarValueEntryOrBuilder>)this.overrideMap_);
            }
            
            public AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry.Builder addOverrideMapBuilder() {
                return this.getOverrideMapFieldBuilder().addBuilder(AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry.getDefaultInstance());
            }
            
            public AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry.Builder addOverrideMapBuilder(final int index) {
                return this.getOverrideMapFieldBuilder().addBuilder(index, AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry.getDefaultInstance());
            }
            
            public List<AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry.Builder> getOverrideMapBuilderList() {
                return this.getOverrideMapFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry, AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry.Builder, AbilityScalarValueEntryOuterClass.AbilityScalarValueEntryOrBuilder> getOverrideMapFieldBuilder() {
                if (this.overrideMapBuilder_ == null) {
                    this.overrideMapBuilder_ = new RepeatedFieldBuilderV3<AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry, AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry.Builder, AbilityScalarValueEntryOuterClass.AbilityScalarValueEntryOrBuilder>(this.overrideMap_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.overrideMap_ = null;
                }
                return this.overrideMapBuilder_;
            }
            
            @Override
            public int getInstancedAbilityId() {
                return this.instancedAbilityId_;
            }
            
            public Builder setInstancedAbilityId(final int value) {
                this.instancedAbilityId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearInstancedAbilityId() {
                this.instancedAbilityId_ = 0;
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
    
    public interface AbilityAppliedAbilityOrBuilder extends MessageOrBuilder
    {
        boolean hasAbilityName();
        
        AbilityStringOuterClass.AbilityString getAbilityName();
        
        AbilityStringOuterClass.AbilityStringOrBuilder getAbilityNameOrBuilder();
        
        boolean hasAbilityOverride();
        
        AbilityStringOuterClass.AbilityString getAbilityOverride();
        
        AbilityStringOuterClass.AbilityStringOrBuilder getAbilityOverrideOrBuilder();
        
        List<AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry> getOverrideMapList();
        
        AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry getOverrideMap(final int p0);
        
        int getOverrideMapCount();
        
        List<? extends AbilityScalarValueEntryOuterClass.AbilityScalarValueEntryOrBuilder> getOverrideMapOrBuilderList();
        
        AbilityScalarValueEntryOuterClass.AbilityScalarValueEntryOrBuilder getOverrideMapOrBuilder(final int p0);
        
        int getInstancedAbilityId();
    }
}
