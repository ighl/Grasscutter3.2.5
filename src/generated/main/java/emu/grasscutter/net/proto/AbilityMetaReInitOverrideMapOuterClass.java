// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.RepeatedFieldBuilderV3;
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

public final class AbilityMetaReInitOverrideMapOuterClass
{
    private static final Descriptors.Descriptor internal_static_AbilityMetaReInitOverrideMap_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AbilityMetaReInitOverrideMap_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private AbilityMetaReInitOverrideMapOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return AbilityMetaReInitOverrideMapOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\"AbilityMetaReInitOverrideMap.proto\u001a\u001dAbilityScalarValueEntry.proto\"N\n\u001cAbilityMetaReInitOverrideMap\u0012.\n\foverride_map\u0018\u0007 \u0003(\u000b2\u0018.AbilityScalarValueEntryB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        AbilityMetaReInitOverrideMapOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { AbilityScalarValueEntryOuterClass.getDescriptor() });
        internal_static_AbilityMetaReInitOverrideMap_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_AbilityMetaReInitOverrideMap_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(AbilityMetaReInitOverrideMapOuterClass.internal_static_AbilityMetaReInitOverrideMap_descriptor, new String[] { "OverrideMap" });
        AbilityScalarValueEntryOuterClass.getDescriptor();
    }
    
    public static final class AbilityMetaReInitOverrideMap extends GeneratedMessageV3 implements AbilityMetaReInitOverrideMapOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int OVERRIDE_MAP_FIELD_NUMBER = 7;
        private List<AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry> overrideMap_;
        private byte memoizedIsInitialized;
        private static final AbilityMetaReInitOverrideMap DEFAULT_INSTANCE;
        private static final Parser<AbilityMetaReInitOverrideMap> PARSER;
        
        private AbilityMetaReInitOverrideMap(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private AbilityMetaReInitOverrideMap() {
            this.memoizedIsInitialized = -1;
            this.overrideMap_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new AbilityMetaReInitOverrideMap();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private AbilityMetaReInitOverrideMap(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 58: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.overrideMap_ = new ArrayList<AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.overrideMap_.add(input.readMessage(AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry.parser(), extensionRegistry));
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
            return AbilityMetaReInitOverrideMapOuterClass.internal_static_AbilityMetaReInitOverrideMap_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return AbilityMetaReInitOverrideMapOuterClass.internal_static_AbilityMetaReInitOverrideMap_fieldAccessorTable.ensureFieldAccessorsInitialized(AbilityMetaReInitOverrideMap.class, Builder.class);
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
            for (int i = 0; i < this.overrideMap_.size(); ++i) {
                output.writeMessage(7, this.overrideMap_.get(i));
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
            for (int i = 0; i < this.overrideMap_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(7, this.overrideMap_.get(i));
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbilityMetaReInitOverrideMap)) {
                return super.equals(obj);
            }
            final AbilityMetaReInitOverrideMap other = (AbilityMetaReInitOverrideMap)obj;
            return this.getOverrideMapList().equals(other.getOverrideMapList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getOverrideMapCount() > 0) {
                hash = 37 * hash + 7;
                hash = 53 * hash + this.getOverrideMapList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static AbilityMetaReInitOverrideMap parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return AbilityMetaReInitOverrideMap.PARSER.parseFrom(data);
        }
        
        public static AbilityMetaReInitOverrideMap parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AbilityMetaReInitOverrideMap.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AbilityMetaReInitOverrideMap parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return AbilityMetaReInitOverrideMap.PARSER.parseFrom(data);
        }
        
        public static AbilityMetaReInitOverrideMap parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AbilityMetaReInitOverrideMap.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AbilityMetaReInitOverrideMap parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return AbilityMetaReInitOverrideMap.PARSER.parseFrom(data);
        }
        
        public static AbilityMetaReInitOverrideMap parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AbilityMetaReInitOverrideMap.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AbilityMetaReInitOverrideMap parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AbilityMetaReInitOverrideMap.PARSER, input);
        }
        
        public static AbilityMetaReInitOverrideMap parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AbilityMetaReInitOverrideMap.PARSER, input, extensionRegistry);
        }
        
        public static AbilityMetaReInitOverrideMap parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AbilityMetaReInitOverrideMap.PARSER, input);
        }
        
        public static AbilityMetaReInitOverrideMap parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AbilityMetaReInitOverrideMap.PARSER, input, extensionRegistry);
        }
        
        public static AbilityMetaReInitOverrideMap parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AbilityMetaReInitOverrideMap.PARSER, input);
        }
        
        public static AbilityMetaReInitOverrideMap parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AbilityMetaReInitOverrideMap.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return AbilityMetaReInitOverrideMap.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final AbilityMetaReInitOverrideMap prototype) {
            return AbilityMetaReInitOverrideMap.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == AbilityMetaReInitOverrideMap.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static AbilityMetaReInitOverrideMap getDefaultInstance() {
            return AbilityMetaReInitOverrideMap.DEFAULT_INSTANCE;
        }
        
        public static Parser<AbilityMetaReInitOverrideMap> parser() {
            return AbilityMetaReInitOverrideMap.PARSER;
        }
        
        @Override
        public Parser<AbilityMetaReInitOverrideMap> getParserForType() {
            return AbilityMetaReInitOverrideMap.PARSER;
        }
        
        @Override
        public AbilityMetaReInitOverrideMap getDefaultInstanceForType() {
            return AbilityMetaReInitOverrideMap.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new AbilityMetaReInitOverrideMap();
            PARSER = new AbstractParser<AbilityMetaReInitOverrideMap>() {
                @Override
                public AbilityMetaReInitOverrideMap parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new AbilityMetaReInitOverrideMap(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AbilityMetaReInitOverrideMapOrBuilder
        {
            private int bitField0_;
            private List<AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry> overrideMap_;
            private RepeatedFieldBuilderV3<AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry, AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry.Builder, AbilityScalarValueEntryOuterClass.AbilityScalarValueEntryOrBuilder> overrideMapBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return AbilityMetaReInitOverrideMapOuterClass.internal_static_AbilityMetaReInitOverrideMap_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return AbilityMetaReInitOverrideMapOuterClass.internal_static_AbilityMetaReInitOverrideMap_fieldAccessorTable.ensureFieldAccessorsInitialized(AbilityMetaReInitOverrideMap.class, Builder.class);
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
                if (AbilityMetaReInitOverrideMap.alwaysUseFieldBuilders) {
                    this.getOverrideMapFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.overrideMapBuilder_ == null) {
                    this.overrideMap_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.overrideMapBuilder_.clear();
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return AbilityMetaReInitOverrideMapOuterClass.internal_static_AbilityMetaReInitOverrideMap_descriptor;
            }
            
            @Override
            public AbilityMetaReInitOverrideMap getDefaultInstanceForType() {
                return AbilityMetaReInitOverrideMap.getDefaultInstance();
            }
            
            @Override
            public AbilityMetaReInitOverrideMap build() {
                final AbilityMetaReInitOverrideMap result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public AbilityMetaReInitOverrideMap buildPartial() {
                final AbilityMetaReInitOverrideMap result = new AbilityMetaReInitOverrideMap(this);
                final int from_bitField0_ = this.bitField0_;
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
                if (other instanceof AbilityMetaReInitOverrideMap) {
                    return this.mergeFrom((AbilityMetaReInitOverrideMap)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final AbilityMetaReInitOverrideMap other) {
                if (other == AbilityMetaReInitOverrideMap.getDefaultInstance()) {
                    return this;
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
                        this.overrideMapBuilder_ = (AbilityMetaReInitOverrideMap.alwaysUseFieldBuilders ? this.getOverrideMapFieldBuilder() : null);
                    }
                    else {
                        this.overrideMapBuilder_.addAllMessages(other.overrideMap_);
                    }
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
                AbilityMetaReInitOverrideMap parsedMessage = null;
                try {
                    parsedMessage = AbilityMetaReInitOverrideMap.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (AbilityMetaReInitOverrideMap)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
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
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface AbilityMetaReInitOverrideMapOrBuilder extends MessageOrBuilder
    {
        List<AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry> getOverrideMapList();
        
        AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry getOverrideMap(final int p0);
        
        int getOverrideMapCount();
        
        List<? extends AbilityScalarValueEntryOuterClass.AbilityScalarValueEntryOrBuilder> getOverrideMapOrBuilderList();
        
        AbilityScalarValueEntryOuterClass.AbilityScalarValueEntryOrBuilder getOverrideMapOrBuilder(final int p0);
    }
}
