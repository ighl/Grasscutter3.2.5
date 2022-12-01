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

public final class MusicBeatmapListOuterClass
{
    private static final Descriptors.Descriptor internal_static_MusicBeatmapList_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_MusicBeatmapList_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private MusicBeatmapListOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return MusicBeatmapListOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0016MusicBeatmapList.proto\u001a\u0016MusicBeatmapNote.proto\"@\n\u0010MusicBeatmapList\u0012,\n\u0011beatmap_note_list\u0018\u0001 \u0003(\u000b2\u0011.MusicBeatmapNoteB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        MusicBeatmapListOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { MusicBeatmapNoteOuterClass.getDescriptor() });
        internal_static_MusicBeatmapList_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_MusicBeatmapList_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(MusicBeatmapListOuterClass.internal_static_MusicBeatmapList_descriptor, new String[] { "BeatmapNoteList" });
        MusicBeatmapNoteOuterClass.getDescriptor();
    }
    
    public static final class MusicBeatmapList extends GeneratedMessageV3 implements MusicBeatmapListOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int BEATMAP_NOTE_LIST_FIELD_NUMBER = 1;
        private List<MusicBeatmapNoteOuterClass.MusicBeatmapNote> beatmapNoteList_;
        private byte memoizedIsInitialized;
        private static final MusicBeatmapList DEFAULT_INSTANCE;
        private static final Parser<MusicBeatmapList> PARSER;
        
        private MusicBeatmapList(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private MusicBeatmapList() {
            this.memoizedIsInitialized = -1;
            this.beatmapNoteList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new MusicBeatmapList();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private MusicBeatmapList(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.beatmapNoteList_ = new ArrayList<MusicBeatmapNoteOuterClass.MusicBeatmapNote>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.beatmapNoteList_.add(input.readMessage(MusicBeatmapNoteOuterClass.MusicBeatmapNote.parser(), extensionRegistry));
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
                    this.beatmapNoteList_ = Collections.unmodifiableList((List<? extends MusicBeatmapNoteOuterClass.MusicBeatmapNote>)this.beatmapNoteList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return MusicBeatmapListOuterClass.internal_static_MusicBeatmapList_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return MusicBeatmapListOuterClass.internal_static_MusicBeatmapList_fieldAccessorTable.ensureFieldAccessorsInitialized(MusicBeatmapList.class, Builder.class);
        }
        
        @Override
        public List<MusicBeatmapNoteOuterClass.MusicBeatmapNote> getBeatmapNoteListList() {
            return this.beatmapNoteList_;
        }
        
        @Override
        public List<? extends MusicBeatmapNoteOuterClass.MusicBeatmapNoteOrBuilder> getBeatmapNoteListOrBuilderList() {
            return this.beatmapNoteList_;
        }
        
        @Override
        public int getBeatmapNoteListCount() {
            return this.beatmapNoteList_.size();
        }
        
        @Override
        public MusicBeatmapNoteOuterClass.MusicBeatmapNote getBeatmapNoteList(final int index) {
            return this.beatmapNoteList_.get(index);
        }
        
        @Override
        public MusicBeatmapNoteOuterClass.MusicBeatmapNoteOrBuilder getBeatmapNoteListOrBuilder(final int index) {
            return this.beatmapNoteList_.get(index);
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
            for (int i = 0; i < this.beatmapNoteList_.size(); ++i) {
                output.writeMessage(1, this.beatmapNoteList_.get(i));
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
            for (int i = 0; i < this.beatmapNoteList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(1, this.beatmapNoteList_.get(i));
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MusicBeatmapList)) {
                return super.equals(obj);
            }
            final MusicBeatmapList other = (MusicBeatmapList)obj;
            return this.getBeatmapNoteListList().equals(other.getBeatmapNoteListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getBeatmapNoteListCount() > 0) {
                hash = 37 * hash + 1;
                hash = 53 * hash + this.getBeatmapNoteListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static MusicBeatmapList parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return MusicBeatmapList.PARSER.parseFrom(data);
        }
        
        public static MusicBeatmapList parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MusicBeatmapList.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MusicBeatmapList parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return MusicBeatmapList.PARSER.parseFrom(data);
        }
        
        public static MusicBeatmapList parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MusicBeatmapList.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MusicBeatmapList parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return MusicBeatmapList.PARSER.parseFrom(data);
        }
        
        public static MusicBeatmapList parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MusicBeatmapList.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MusicBeatmapList parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MusicBeatmapList.PARSER, input);
        }
        
        public static MusicBeatmapList parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MusicBeatmapList.PARSER, input, extensionRegistry);
        }
        
        public static MusicBeatmapList parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(MusicBeatmapList.PARSER, input);
        }
        
        public static MusicBeatmapList parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(MusicBeatmapList.PARSER, input, extensionRegistry);
        }
        
        public static MusicBeatmapList parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MusicBeatmapList.PARSER, input);
        }
        
        public static MusicBeatmapList parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MusicBeatmapList.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return MusicBeatmapList.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final MusicBeatmapList prototype) {
            return MusicBeatmapList.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == MusicBeatmapList.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static MusicBeatmapList getDefaultInstance() {
            return MusicBeatmapList.DEFAULT_INSTANCE;
        }
        
        public static Parser<MusicBeatmapList> parser() {
            return MusicBeatmapList.PARSER;
        }
        
        @Override
        public Parser<MusicBeatmapList> getParserForType() {
            return MusicBeatmapList.PARSER;
        }
        
        @Override
        public MusicBeatmapList getDefaultInstanceForType() {
            return MusicBeatmapList.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new MusicBeatmapList();
            PARSER = new AbstractParser<MusicBeatmapList>() {
                @Override
                public MusicBeatmapList parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new MusicBeatmapList(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MusicBeatmapListOrBuilder
        {
            private int bitField0_;
            private List<MusicBeatmapNoteOuterClass.MusicBeatmapNote> beatmapNoteList_;
            private RepeatedFieldBuilderV3<MusicBeatmapNoteOuterClass.MusicBeatmapNote, MusicBeatmapNoteOuterClass.MusicBeatmapNote.Builder, MusicBeatmapNoteOuterClass.MusicBeatmapNoteOrBuilder> beatmapNoteListBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return MusicBeatmapListOuterClass.internal_static_MusicBeatmapList_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return MusicBeatmapListOuterClass.internal_static_MusicBeatmapList_fieldAccessorTable.ensureFieldAccessorsInitialized(MusicBeatmapList.class, Builder.class);
            }
            
            private Builder() {
                this.beatmapNoteList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.beatmapNoteList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (MusicBeatmapList.alwaysUseFieldBuilders) {
                    this.getBeatmapNoteListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.beatmapNoteListBuilder_ == null) {
                    this.beatmapNoteList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.beatmapNoteListBuilder_.clear();
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return MusicBeatmapListOuterClass.internal_static_MusicBeatmapList_descriptor;
            }
            
            @Override
            public MusicBeatmapList getDefaultInstanceForType() {
                return MusicBeatmapList.getDefaultInstance();
            }
            
            @Override
            public MusicBeatmapList build() {
                final MusicBeatmapList result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public MusicBeatmapList buildPartial() {
                final MusicBeatmapList result = new MusicBeatmapList(this);
                final int from_bitField0_ = this.bitField0_;
                if (this.beatmapNoteListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.beatmapNoteList_ = Collections.unmodifiableList((List<? extends MusicBeatmapNoteOuterClass.MusicBeatmapNote>)this.beatmapNoteList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.beatmapNoteList_ = this.beatmapNoteList_;
                }
                else {
                    result.beatmapNoteList_ = this.beatmapNoteListBuilder_.build();
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
                if (other instanceof MusicBeatmapList) {
                    return this.mergeFrom((MusicBeatmapList)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final MusicBeatmapList other) {
                if (other == MusicBeatmapList.getDefaultInstance()) {
                    return this;
                }
                if (this.beatmapNoteListBuilder_ == null) {
                    if (!other.beatmapNoteList_.isEmpty()) {
                        if (this.beatmapNoteList_.isEmpty()) {
                            this.beatmapNoteList_ = other.beatmapNoteList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureBeatmapNoteListIsMutable();
                            this.beatmapNoteList_.addAll(other.beatmapNoteList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.beatmapNoteList_.isEmpty()) {
                    if (this.beatmapNoteListBuilder_.isEmpty()) {
                        this.beatmapNoteListBuilder_.dispose();
                        this.beatmapNoteListBuilder_ = null;
                        this.beatmapNoteList_ = other.beatmapNoteList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.beatmapNoteListBuilder_ = (MusicBeatmapList.alwaysUseFieldBuilders ? this.getBeatmapNoteListFieldBuilder() : null);
                    }
                    else {
                        this.beatmapNoteListBuilder_.addAllMessages(other.beatmapNoteList_);
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
                MusicBeatmapList parsedMessage = null;
                try {
                    parsedMessage = MusicBeatmapList.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (MusicBeatmapList)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureBeatmapNoteListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.beatmapNoteList_ = new ArrayList<MusicBeatmapNoteOuterClass.MusicBeatmapNote>(this.beatmapNoteList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<MusicBeatmapNoteOuterClass.MusicBeatmapNote> getBeatmapNoteListList() {
                if (this.beatmapNoteListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends MusicBeatmapNoteOuterClass.MusicBeatmapNote>)this.beatmapNoteList_);
                }
                return this.beatmapNoteListBuilder_.getMessageList();
            }
            
            @Override
            public int getBeatmapNoteListCount() {
                if (this.beatmapNoteListBuilder_ == null) {
                    return this.beatmapNoteList_.size();
                }
                return this.beatmapNoteListBuilder_.getCount();
            }
            
            @Override
            public MusicBeatmapNoteOuterClass.MusicBeatmapNote getBeatmapNoteList(final int index) {
                if (this.beatmapNoteListBuilder_ == null) {
                    return this.beatmapNoteList_.get(index);
                }
                return this.beatmapNoteListBuilder_.getMessage(index);
            }
            
            public Builder setBeatmapNoteList(final int index, final MusicBeatmapNoteOuterClass.MusicBeatmapNote value) {
                if (this.beatmapNoteListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureBeatmapNoteListIsMutable();
                    this.beatmapNoteList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.beatmapNoteListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setBeatmapNoteList(final int index, final MusicBeatmapNoteOuterClass.MusicBeatmapNote.Builder builderForValue) {
                if (this.beatmapNoteListBuilder_ == null) {
                    this.ensureBeatmapNoteListIsMutable();
                    this.beatmapNoteList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.beatmapNoteListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addBeatmapNoteList(final MusicBeatmapNoteOuterClass.MusicBeatmapNote value) {
                if (this.beatmapNoteListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureBeatmapNoteListIsMutable();
                    this.beatmapNoteList_.add(value);
                    this.onChanged();
                }
                else {
                    this.beatmapNoteListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addBeatmapNoteList(final int index, final MusicBeatmapNoteOuterClass.MusicBeatmapNote value) {
                if (this.beatmapNoteListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureBeatmapNoteListIsMutable();
                    this.beatmapNoteList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.beatmapNoteListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addBeatmapNoteList(final MusicBeatmapNoteOuterClass.MusicBeatmapNote.Builder builderForValue) {
                if (this.beatmapNoteListBuilder_ == null) {
                    this.ensureBeatmapNoteListIsMutable();
                    this.beatmapNoteList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.beatmapNoteListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addBeatmapNoteList(final int index, final MusicBeatmapNoteOuterClass.MusicBeatmapNote.Builder builderForValue) {
                if (this.beatmapNoteListBuilder_ == null) {
                    this.ensureBeatmapNoteListIsMutable();
                    this.beatmapNoteList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.beatmapNoteListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllBeatmapNoteList(final Iterable<? extends MusicBeatmapNoteOuterClass.MusicBeatmapNote> values) {
                if (this.beatmapNoteListBuilder_ == null) {
                    this.ensureBeatmapNoteListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.beatmapNoteList_);
                    this.onChanged();
                }
                else {
                    this.beatmapNoteListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearBeatmapNoteList() {
                if (this.beatmapNoteListBuilder_ == null) {
                    this.beatmapNoteList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.beatmapNoteListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeBeatmapNoteList(final int index) {
                if (this.beatmapNoteListBuilder_ == null) {
                    this.ensureBeatmapNoteListIsMutable();
                    this.beatmapNoteList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.beatmapNoteListBuilder_.remove(index);
                }
                return this;
            }
            
            public MusicBeatmapNoteOuterClass.MusicBeatmapNote.Builder getBeatmapNoteListBuilder(final int index) {
                return this.getBeatmapNoteListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public MusicBeatmapNoteOuterClass.MusicBeatmapNoteOrBuilder getBeatmapNoteListOrBuilder(final int index) {
                if (this.beatmapNoteListBuilder_ == null) {
                    return this.beatmapNoteList_.get(index);
                }
                return this.beatmapNoteListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends MusicBeatmapNoteOuterClass.MusicBeatmapNoteOrBuilder> getBeatmapNoteListOrBuilderList() {
                if (this.beatmapNoteListBuilder_ != null) {
                    return this.beatmapNoteListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends MusicBeatmapNoteOuterClass.MusicBeatmapNoteOrBuilder>)this.beatmapNoteList_);
            }
            
            public MusicBeatmapNoteOuterClass.MusicBeatmapNote.Builder addBeatmapNoteListBuilder() {
                return this.getBeatmapNoteListFieldBuilder().addBuilder(MusicBeatmapNoteOuterClass.MusicBeatmapNote.getDefaultInstance());
            }
            
            public MusicBeatmapNoteOuterClass.MusicBeatmapNote.Builder addBeatmapNoteListBuilder(final int index) {
                return this.getBeatmapNoteListFieldBuilder().addBuilder(index, MusicBeatmapNoteOuterClass.MusicBeatmapNote.getDefaultInstance());
            }
            
            public List<MusicBeatmapNoteOuterClass.MusicBeatmapNote.Builder> getBeatmapNoteListBuilderList() {
                return this.getBeatmapNoteListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<MusicBeatmapNoteOuterClass.MusicBeatmapNote, MusicBeatmapNoteOuterClass.MusicBeatmapNote.Builder, MusicBeatmapNoteOuterClass.MusicBeatmapNoteOrBuilder> getBeatmapNoteListFieldBuilder() {
                if (this.beatmapNoteListBuilder_ == null) {
                    this.beatmapNoteListBuilder_ = new RepeatedFieldBuilderV3<MusicBeatmapNoteOuterClass.MusicBeatmapNote, MusicBeatmapNoteOuterClass.MusicBeatmapNote.Builder, MusicBeatmapNoteOuterClass.MusicBeatmapNoteOrBuilder>(this.beatmapNoteList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.beatmapNoteList_ = null;
                }
                return this.beatmapNoteListBuilder_;
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
    
    public interface MusicBeatmapListOrBuilder extends MessageOrBuilder
    {
        List<MusicBeatmapNoteOuterClass.MusicBeatmapNote> getBeatmapNoteListList();
        
        MusicBeatmapNoteOuterClass.MusicBeatmapNote getBeatmapNoteList(final int p0);
        
        int getBeatmapNoteListCount();
        
        List<? extends MusicBeatmapNoteOuterClass.MusicBeatmapNoteOrBuilder> getBeatmapNoteListOrBuilderList();
        
        MusicBeatmapNoteOuterClass.MusicBeatmapNoteOrBuilder getBeatmapNoteListOrBuilder(final int p0);
    }
}
